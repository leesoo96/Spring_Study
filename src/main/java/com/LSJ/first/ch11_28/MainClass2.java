package com.LSJ.first.ch11_28;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass2 {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:Student11_28CTX2.xml");
		
		ctx.refresh();
		
		ctx.close();
	}
}
