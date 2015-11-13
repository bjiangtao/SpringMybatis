package com.beanlife;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.reflect.Car;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月13日下午3:49:13
 *@version: V1.0
 *@Description:
 */
public class BeanLifeCycle {
	
	private static void lifeCyclenBeanFactory(){
		//装载配置文件并启动容器
		Resource rs=new ClassPathResource("com/beanfactory/beans.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
		//向容器中注册MyBeanPostProcessor后处理器
		((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
		((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
		
		Car car1=(Car)bf.getBean("car");
		car1.say();
		car1.setColor("红色");
		
		Car car2=(Car)bf.getBean("car");
		System.out.println("car1==car2:"+(car1==car2));
		//关闭容器
		((XmlBeanFactory)bf).destroySingletons();
		
	}
	
	public static void main(String[] args) {
		lifeCyclenBeanFactory();
	}
}
