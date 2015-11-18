package com.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import com.baobaotao.Seller;
import com.baobaotao.SmartSeller;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月18日下午2:20:12
 *@version: V1.0
 *@Description:
 */
@Aspect
public class EnableSellerAspect {
	@DeclareParents(value="com.advice.NaiveWaiter",defaultImpl=SmartSeller.class)
	public Seller seller;
}
