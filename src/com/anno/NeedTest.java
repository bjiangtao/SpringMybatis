package com.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月17日下午3:30:16
 *@version: V1.0
 *@Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NeedTest {
	boolean value() default true;

}
