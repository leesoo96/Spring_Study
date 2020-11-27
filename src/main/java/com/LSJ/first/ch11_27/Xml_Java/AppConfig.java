package com.LSJ.first.ch11_27.Xml_Java;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("캠핑");
		hobbys.add("영화보기");

		Student student = new Student("민경훈", 37, hobbys);
		student.setHeight(179);
		student.setWeight(62);
		
		return student;
	}
}
