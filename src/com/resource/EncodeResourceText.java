package com.resource;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月12日下午5:13:46
 *@version: V1.0
 *@Description:
 */
public class EncodeResourceText {
	public static void main(String[] args) throws IOException {
		Resource res=new ClassPathResource("text1.txt");
		EncodedResource encRes=new EncodedResource(res,"UTF-8");
		String content=FileCopyUtils.copyToString(encRes.getReader());
		System.out.println(content);
	}
}
