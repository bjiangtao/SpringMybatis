package com.event;

import org.springframework.context.ApplicationListener;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月16日下午5:13:44
 *@version: V1.0
 *@Description:
 */
public class MailSenderListener implements ApplicationListener<MailSendEvent>{

	@Override
	public void onApplicationEvent(MailSendEvent event) {
		System.out.println("MailSenderListener:向"+event.getTo()+"发送完一封邮件");
	}

}
