package com.spring9.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月18日下午4:27:47
 *@version: V1.0
 *@Description:
 */
public class SimpleThreadLocal {
	private Map valueMap=Collections.synchronizedMap(new HashMap());
	
	public void set(Object newValue){
		valueMap.put(Thread.currentThread(),newValue);
	}
	
	public Object get(){
		Thread currentThread=Thread.currentThread();
		Object obj=valueMap.get(currentThread);
		//如果在map中返回  不在map中暂存起来该线程
		if(obj==null && !valueMap.containsKey(currentThread)){
			obj=initialVale();
			valueMap.put(currentThread, obj);
		}
		return obj;
	}

	public Object initialVale() {
		return null;
	}
	
	public void remove(){
		valueMap.remove(Thread.currentThread());
	}
	
	

}
