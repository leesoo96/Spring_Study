package com.LSJ.first.ch12_01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import sun.tools.jconsole.Worker;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:AOPCTX.xml");
		Student student = ctx.getBean("student", Student.class);
		student.getStudnetInfo();
		
		Workers workers = ctx.getBean("worker", Workers.class);
		workers.getWorkerInfo();
		
		ctx.close();
	}
}
/*AOP - 관점지향프로그래밍
  공통 기능(Aspect)을 핵심 기능과 분리해놓고 
  공통 기능 중에 핵심 기능에 적용하고자하는 부분에 적용

*/