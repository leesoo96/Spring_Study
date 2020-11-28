package com.LSJ.first.ch11_28.Scope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:Student11_28CTX3.xml");
		
		Student student1 = ctx.getBean("student", Student.class);
		System.out.printf("이름 = %s / 나이 = %d \n", student1.getName(), student1.getAge());

		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("홍시영");
		student2.setAge(30); // 속성만 다르게 세팅해준 것뿐, 동일한 객체이다
		System.out.printf("이름 = %s / 나이 = %d \n", student1.getName(), student1.getAge());
//		System.out.printf("이름 = %s / 나이 = %d \n", student2.getName(), student2.getAge());
//		동일한 결과가 나오는 것 확인!
		
		if(student1.equals(student2)) {
			System.out.println("stu1 == stu2");
		}else {
			System.out.println("stu1 != stu2");
		}
//		속성은 달라도 같은 객체를 가리킨다는 것을 확인할 수 있다!
	}
}
