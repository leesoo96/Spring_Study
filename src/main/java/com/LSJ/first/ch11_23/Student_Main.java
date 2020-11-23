package com.LSJ.first.ch11_23;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Student_Main {

	public static void main(String[] args) {
		String configLocation = "classpath:StudentCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		StudentInfo stuInfo = ctx.getBean("studentInfo", StudentInfo.class);
		stuInfo.getStudentInfo();
		
		Student stu = ctx.getBean("student2", Student.class);
		stuInfo.setStudent(stu);
		stuInfo.getStudentInfo();
		
		ctx.close();
	}

}
