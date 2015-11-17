package com.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月17日上午9:54:01
 *@version: V1.0
 *@Description:
 */
public class GreetingAfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnObj, Method method, Object[] args,
			Object obj) throws Throwable {
		System.out.println("enjoy yourself");
	}

}
