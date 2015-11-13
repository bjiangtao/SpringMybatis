package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.reflect.Car;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月13日上午10:37:22
 *@version: V1.0
 *@Description:
 */
public class AnnotationContext {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Beans.class);
		Car car=ac.getBean("car",Car.class);
		System.out.println(car.getColor());
	}
}
