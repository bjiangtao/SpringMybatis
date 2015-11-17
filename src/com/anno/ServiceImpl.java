package com.anno;
/**
 *@author: baijiangtao
 *@createtime: 2015年11月17日下午4:38:23
 *@version: V1.0
 *@Description:
 */
public class ServiceImpl {

	@NeedTest(true)
	public void do1(){
		System.out.println("do1");
	}
	
	@NeedTest(false)
	public void do2(){
		System.out.println("do2");
	}
}
