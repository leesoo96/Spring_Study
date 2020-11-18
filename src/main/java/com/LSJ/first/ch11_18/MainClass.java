package com.LSJ.first.ch11_18;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		/* 스프링 적용 전
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculator(new Calculator());
		
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		*/
		
//		xml 파일의 경로 명시
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
//		<bean id="myCalculator" class="com.LSJ.first.MyCalculator"> -> 이 클래스를 말함!
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		
	}
	
}
