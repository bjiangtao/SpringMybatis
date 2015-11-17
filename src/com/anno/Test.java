package com.anno;

import java.lang.reflect.Method;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月17日下午4:40:45
 *@version: V1.0
 *@Description:
 */
public class Test {
	public static void main(String[] args) {
		Class claz=ServiceImpl.class;
		Method[] methods = claz.getDeclaredMethods();
		System.out.println(methods.length);
		for(Method m:methods){
			NeedTest nt=m.getAnnotation(NeedTest.class);
			if(nt!=null){
				if(nt.value())
					System.out.println(m.getName()+"（）需要测试");
				else
					System.out.println(m.getName()+"（）不需要测试");
			}
		}
	}
}
