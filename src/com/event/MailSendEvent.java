package com.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月16日下午5:10:01
 *@version: V1.0
 *@Description:
 */
public class MailSendEvent extends ApplicationContextEvent{
	private String to;

	public MailSendEvent(ApplicationContext source,String to) {
		super(source);
		this.to=to;
	}
	
	public String getTo(){
		return to;
	}
	
}
