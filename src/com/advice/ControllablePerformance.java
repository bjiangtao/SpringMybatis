package com.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月17日下午1:49:06
 *@version: V1.0
 *@Description:
 */
public class ControllablePerformance extends DelegatingIntroductionInterceptor implements Monitorable{

	private ThreadLocal<Boolean> monitorMap=new ThreadLocal<Boolean>();
	@Override
	public void setMonitorActive(boolean active) {
		monitorMap.set(active);
	}
	
	public Object invoke(MethodInvocation mi) throws Throwable{
		Object obj=null;
		if(monitorMap.get()!=null && monitorMap.get()){
			System.out.println("jianko");
			obj=super.invoke(mi);
			System.out.println("jiankong jieshu");
		}else{
			obj=super.invoke(mi);
		}
		return obj;
	}
	
	

}
