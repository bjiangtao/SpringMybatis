package com.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月17日上午10:00:06
 *@version: V1.0
 *@Description:
 */
public class GreetingInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object[] args = invocation.getArguments();
		String str=(String)args[0];
		System.out.println("qian:"+str);
		Object obj = invocation.proceed();
		System.out.println("hou");
		return obj;
	}

}
