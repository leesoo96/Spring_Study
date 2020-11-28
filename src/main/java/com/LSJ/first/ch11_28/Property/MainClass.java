package com.LSJ.first.ch11_28.Property;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:adminCTX2.xml");
		
		AdminConnect aConnect = ctx.getBean("aConnect", AdminConnect.class);
		
		System.out.printf("adminID = %s | adminPW = %s \n", 
						   aConnect.getAdminId(), 
						   aConnect.getAdminPw());
		System.out.printf("sub_adminID = %s | sub_adminPW = %s \n", 
				   aConnect.getSub_adminId(), 
				   aConnect.getSub_adminPw());
		
		ctx.close();
	}
}
