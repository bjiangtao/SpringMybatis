package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.reflect.Car;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月13日上午10:35:20
 *@version: V1.0
 *@Description:
 */
@Configuration
public class Beans {
	
	@Bean(name="car")
	public Car buildCar(){
		Car car=new Car();
		car.setBrand("红旗");
		car.setColor("hongse");
		return car;
	}
}
