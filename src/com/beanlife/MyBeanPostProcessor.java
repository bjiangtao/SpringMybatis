package com.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.reflect.Car;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月13日下午3:28:09
 *@version: V1.0
 *@Description:
 */
public class MyBeanPostProcessor implements BeanPostProcessor{
	
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		if(beanName.equals("car")){
			Car car=(Car)bean;
			if(car.getColor()==null){
				System.out.println("调用BeanPostProcessor.postProcessBeforeInitialization，color为空，设置默认黑色");
				car.setColor("黑色");
			}
		}
		return bean;
	}

	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		if(beanName.equals("car")){
			Car car=(Car)bean;
			if(car.getMaxSpeed()>=200){
				System.out.println("调用BeanPostProcessor.postProcessAfterInitialization，");
				car.setMaxSpeed(200);
			}
		}
		return bean;
	}

	
}
