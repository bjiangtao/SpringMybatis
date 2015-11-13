package com.beanlife;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月13日下午3:10:54
 *@version: V1.0
 *@Description:
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
	
	
	//接口方法：在实例化bean前进行调用
	public Object postProcessBeforeInstantiation(Class besanClass,String beanName) throws BeansException{
		
		if("car".equals(beanName)){
			System.out.println("调用InstantiationAwareBeanPostProcessorAdapter.postProcessBeforeInstantiation方法");
		}
		return null;
	}
	//在实例化bean后调用
	public boolean postProcessAfterInstantiation(Object bean,String beanName) throws BeansException{
		if("car".equals(beanName)){
			System.out.println("调用InstantiationAwareBeanPostProcessorAdapter.postProcessAfterInstantiation方法");
		}
		return true;
	}
	//在设置某个属性时调用
	public PropertyValues postProcessPropertyValues(PropertyValues pvs,PropertyDescriptor[] pds,Object
			 bean,String beanName) throws BeansException{
		if("car".equals(beanName)){
			System.out.println("调用InstantiationAwareBeanPostProcessorAdapter.postProcessPropertyValues方法");
		}
		return pvs;
	}

}
