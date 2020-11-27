package com.LSJ.first.ch11_27.Xml_Java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.printf("이름 = %s, 나이 = %d, 취미 = %s \n",
				student1.getName(), student1.getAge(), student1.getHobbys());
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.printf("이름 = %s, 나이 = %d, 취미 = %s",
				student2.getName(), student2.getAge(), student2.getHobbys());
		
		ctx.close();
		
	}
}
