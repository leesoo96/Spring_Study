package com.LSJ.first.ch11_18.exam;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String configLocation = "classpath:applicationExamCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
//	        파싱해서 컨테이너를 만든다
		
		MyCalculator myCalc = ctx.getBean("myCalculator", MyCalculator.class);
		myCalc.add();
		myCalc.sub();
		myCalc.multi();
		myCalc.div();
	}
}
