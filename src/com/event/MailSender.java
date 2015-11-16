package com.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月16日下午5:15:45
 *@version: V1.0
 *@Description:
 */
public class MailSender implements ApplicationContextAware{
	
	private ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx=ctx;
	}

	public void sendMail(String to){
		System.out.println("MailSender:发送邮件");
		MailSendEvent mse=new MailSendEvent(ctx, to);
		ctx.publishEvent(mse);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/event/beans.xml");
		MailSender mailSender=(MailSender)ctx.getBean("mailSender");
		mailSender.sendMail("aaa@bb.com");
	}
	
}
