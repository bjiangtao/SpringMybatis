package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月12日下午3:50:17
 *@version: V1.0
 *@Description:
 */
public class ReflectTest {
	
	public static Car initByDefaultConst() throws Throwable{
		ClassLoader loader=Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("com.reflect.Car");
		Constructor cons = clazz.getDeclaredConstructor((Class[])null);
		Car car=(Car)cons.newInstance();		
		Method setBrand = clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "红旗");
		Method setColor = clazz.getMethod("setColor", String.class);
		setColor.invoke(car, "hongse");
//		Constructor cons = clazz.getDeclaredConstructor();
//		Car car=(Car)cons.newInstance();		
		return car;
	}
	
//	public static void main(String[] args) throws Throwable {
//		Car car = initByDefaultConst();
//		car.say();
//	}
	
	public static void main(String[] args) throws Throwable {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?> loadClass = loader.loadClass("com.reflect.Car");
		Car car=(Car)loadClass.newInstance();
		
		Field color=loadClass.getDeclaredField("color");
//		color.setAccessible(true);
		color.set(car, "hongse");
		
		Method drive=loadClass.getDeclaredMethod("drive",(Class[])null);
		drive.invoke(car, null);
		
	}

}
