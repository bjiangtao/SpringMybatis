package com.beanfactory;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.reflect.Car;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月13日上午10:41:02
 *@version: V1.0
 *@Description:
 */
public class BeanFactoryTest {
	public static void main(String[] args) {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:com/beanfactory/beans.xml");
		XmlBeanFactory bf = new XmlBeanFactory(res);
		System.out.println("init");
		Car car=bf.getBean("car",Car.class);
		System.out.println(car.getColor());
	}
}
