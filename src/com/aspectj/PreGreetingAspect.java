package com.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月17日下午5:14:55
 *@version: V1.0
 *@Description:
 */
@Aspect
public class PreGreetingAspect {
	@Before("execution(* greetTo(..))")
	public void beforeGreeting(){
		System.out.println("nihao");
	}
}
