package com.LSJ.first.ch11_23.exam;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String configLocation = "classpath:MyInfoExamCTX.xml";
		
//		AbstractApplicationContext <- 상속!! GenericXmlApplicationContext
//		컨테이너 생성(IOC) - 객체를 생성하고 조립한다.
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
//		컨테이너에서 컴포넌트를 가져온다
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		myInfo.getInfo();
		
		ctx.close(); // 자원 해제
	}
}
