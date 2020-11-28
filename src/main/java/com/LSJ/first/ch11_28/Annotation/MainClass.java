package com.LSJ.first.ch11_28.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminConnection connection = ctx.getBean("adminConfig", AdminConnection.class);
		
		System.out.printf("adminID = %s | adminPW = %s \n", 
						   connection.getAdminId(), 
						   connection.getAdminPw());

		System.out.printf("sub_adminID = %s | sub_adminPW = %s \n", 
			       		   connection.getSub_adminId(), 
			       		   connection.getSub_adminPw());
		
		ctx.close();
		
	}
	
}
