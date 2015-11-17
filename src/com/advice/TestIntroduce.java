package com.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.introduce.ForumService;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月17日下午2:07:12
 *@version: V1.0
 *@Description:
 */
public class TestIntroduce {
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/advice/bean2.xml");
		ForumService forumService=(ForumService)ac.getBean("forumService");
		forumService.removeForum(10);
		forumService.removeTopic(20);
		Monitorable monitorable=(Monitorable)forumService;
		monitorable.setMonitorActive(true);
		forumService.removeForum(10);
		forumService.removeTopic(20);
	}
	
}
