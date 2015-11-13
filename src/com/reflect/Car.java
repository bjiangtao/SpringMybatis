package com.reflect;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月12日下午3:48:08
 *@version: V1.0
 *@Description:
 */
public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{
	private String brand;
	private String color;
	private int maxSpeed;
	private BeanFactory beanFactory;
	private String beanName;
	
	public Car(){
		System.out.println("调用car的构造方法");
	}
	
	public Car(String brand,String color){
		this.brand=brand;
		this.color=color;
	}
	
	protected void drive(){
		System.out.println("the color:"+color);
	}
	
	public void say(){
		System.out.println("brand:"+brand+",color:"+color);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//2BeanFactoryAware
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("调用BeanFactory.setBeanFactory方法");
		this.beanFactory=beanFactory;
	}
	//3BeanNameAware
	@Override
	public void setBeanName(String beanName) {
		System.out.println("调用BeanNameAware.setBeanName方法");
		this.beanName=beanName;
	}
	//4InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用4InitializingBean.afterPropertiesSet方法");
	}
	//5DisposableBean
	@Override
	public void destroy() throws Exception {
		System.out.println("调用DisposableBean.destroy方法");
	}
	//6bean的init-method方法
	public void myInit(){
		System.out.println("调用init-method所指定的方法,设置参数");
		this.maxSpeed=240;
	}
	//7bean的destory-method方法
	public void myDestroy(){
		System.out.println("调用destory-method所指定的myDestory");
	}
	
}
