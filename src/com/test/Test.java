package com.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pojo.User;

/**
 *@author: baijiangtao
 *@createtime: 2015年10月26日下午5:08:23
 *@version: V1.0
 *@Description:
 */
public class Test {
	public static void main(String[] args) {
		String resource="conf.xml";
		//类加载器加载mybatis配置
		InputStream in=Test.class.getClassLoader().getResourceAsStream(resource);
		
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		String statement="com.dao.userMapper.getUser";
		User user =session.selectOne(statement,1);
		System.out.println(user.getPwd());
	}
}
