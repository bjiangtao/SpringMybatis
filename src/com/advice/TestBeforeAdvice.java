package com.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeforeAdvice {
//	public static void main(String[] args) {
//		Waiter target=new NaiveWaiter();
//		BeforeAdvice advice=new GreetingBeforeAdvice();
//		
//		ProxyFactory pf=new ProxyFactory();
//		pf.setTarget(target);
//		pf.addAdvice(advice);
//		Waiter proxy=(Waiter)pf.getProxy();
//		proxy.greetTo("bai");
//		proxy.serveTo("bai");
//	}
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/advice/beans.xml");
		Waiter w=(Waiter)ctx.getBean("waiter");
		w.greetTo("bai");
		w.serveTo("bai");
	}
}
