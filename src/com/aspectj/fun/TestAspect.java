package com.aspectj.fun;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月18日下午2:34:34
 *@version: V1.0
 *@Description:
 */
@Aspect
public class TestAspect {
	@AfterReturning("@annotation(com.anno.NeedTest)")
	public void needTestFun(){
		System.out.println("needTestFun() executed");
	}
}
