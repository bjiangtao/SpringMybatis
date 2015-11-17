package com.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月17日上午10:13:16
 *@version: V1.0
 *@Description:
 */
public class TransactionManager implements ThrowsAdvice{
	
	public void afterThrowing(Method method,Object[] args,Object target,Exception ex) throws Throwable{
		System.out.println("----");
		System.out.println("method:"+method.getName());
		System.out.println(ex.getMessage());
		System.out.println("成功回滚");
	}
	
}
