package com.LSJ.first.ch11_28.Enviornment;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		
//		외부파일을 빈으로 설정
		ConfigurableEnvironment env = ctx.getEnvironment();
		
		MutablePropertySources propertySources = env.getPropertySources();
		try {
//									외부 파일을 ResourcePropertySource 객체로 만든다
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
//			propertySources의 소스들 뒤에 외부 파일을 추가시킴
			
//			외부파일의 값들을 잘 가져왔는지 확인!
			System.out.printf("admin.id = %s, admin.pw = %s \n", 
							   env.getProperty("admin.id"), 
							   env.getProperty("admin.pw"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
		gCtx.load("adminCTX.xml");
		gCtx.refresh();
		
		AdminConnection aConnetion = gCtx.getBean("adminConnetion", AdminConnection.class);
		System.out.printf("admin ID = %s, admin PW = %s \n" , 
						   aConnetion.getAdminId(), 
						   aConnetion.getAdminPw());
		
		gCtx.close();
		ctx.close();
	}
}
