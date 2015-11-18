package com.advice;
/**
 *@author: baijiangtao
 *@createtime: 2015年11月18日下午2:39:20
 *@version: V1.0
 *@Description:
 */
public class NaughyWaiter implements Waiter{

	@Override
	public void greetTo(String name) {
		System.out.println("NaughyWaiter:greeting to:"+name);
	}

	@Override
	public void serveTo(String name) {
		// TODO Auto-generated method stub
		
	}

}
