package com.spring9.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DataSourceUtils;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月18日下午5:03:02
 *@version: V1.0
 *@Description:
 */
public class TopicDao {
	
	
//	private Connection conn;
//	
//	public void addTopic() throws SQLException{
//		Statement stat = conn.createStatement();
//		
//	}
	private DataSource datasrouce;
	private static ThreadLocal<Connection> connThreadLocal=new ThreadLocal<Connection>();
	
	public Connection getConnection(){
		if(connThreadLocal.get()==null){
			Connection conn = DataSourceUtils.getConnection(datasrouce);
			connThreadLocal.set(conn);
			return conn;
		}else{
			return connThreadLocal.get();
		}
		
	}
	
	public void addTopic() throws SQLException{
		
		Statement stat = connThreadLocal.get().createStatement();
		
	}
	
}
