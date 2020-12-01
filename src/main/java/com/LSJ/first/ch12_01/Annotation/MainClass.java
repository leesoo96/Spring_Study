package com.LSJ.first.ch12_01.Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("AOP_AnnotationCTX.xml");
		Student student = ctx.getBean("student", Student.class);
		student.getStudnetInfo();
		
		Workers workers = ctx.getBean("worker", Workers.class);
		workers.getWorkerInfo();
		
		ctx.close();
	}
	
	
}
