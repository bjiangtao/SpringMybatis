package com.aspectj.fun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.advice.NaiveWaiter;
import com.advice.NaughyWaiter;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月18日下午2:37:26
 *@version: V1.0
 *@Description:
 */
public class PointcutFunTet {
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/aspectj/fun/beans.xml");
		NaiveWaiter ai =(NaiveWaiter)ac.getBean("naiveWaiter");
		NaughyWaiter au =(NaughyWaiter)ac.getBean("naughyWaiter");
//		<bean id="naiveWaiter" class="com.advice.NaiveWaiter"/>
//		<bean id="naughyWaiter
		
		ai.greetTo("bia");
		au.greetTo("bia");
	}
}
