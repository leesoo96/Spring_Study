package com.LSJ.first.ch11_24;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String configLoaction1 = "classpath:Student2CTX.xml";
		String configLoaction2 = "classpath:Student2_2CTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoaction1, configLoaction2);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.printf("이름=%s, 취미=%s", student1.getName(), student1.getHobbys()+"\n");
		
		StudentInfo stuInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student student2 = stuInfo.getStudent(); // student1 == student2 -> 결국 같은 객체!!
		System.out.printf("이름=%s, 취미=%s", student2.getName(), student2.getHobbys()+"\n");
		
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
		}else {
			System.out.println("student1 != student2");
		}
		
		System.out.println("---------------------------------");
		
		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println(student3.getName());
		
		if(student1.equals(student3)) {
			System.out.println("student1 == student3");
		}else {
			System.out.println("student1 != student3");
		}
		
		Family fam = ctx.getBean("family", Family.class);
		System.out.printf("fatherName=%s, motherName=%s, sisterName=%s, brotherName=%s \n",
				 			fam.getFatherName(), fam.getMotherName(), 
				 			fam.getSisterName(), fam.getBrotherName());
		
		ctx.close();
	}
}
