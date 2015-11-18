package com.aspectj;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.advice.Waiter;
import com.baobaotao.Seller;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月18日上午11:02:29
 *@version: V1.0
 *@Description:
 */
public class AspectJProxyTest {
	public static void main(String[] args) {
//		Waiter target=new NaiveWaiter();
//		AspectJProxyFactory proxyFactory = new AspectJProxyFactory();
//		proxyFactory.setTarget(target);
//		proxyFactory.addAspect(PreGreetingAspect.class);
//		Waiter proxy=proxyFactory.getProxy();
//		proxy.greetTo("bai");
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/aspectj/beans.xml");
		Waiter waiter =(Waiter)ac.getBean("waiter");
		waiter.greetTo("bai");	
		Seller s=(Seller)waiter;
		s.sell("ss", "dd");
		
	}	
}
