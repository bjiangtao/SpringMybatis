package com.advice;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestThrowing {
	
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/advice/bean1.xml");
		UserDao w=(UserDao)ctx.getBean("userDao");
		w.delete();
		w.update();
	}
}
