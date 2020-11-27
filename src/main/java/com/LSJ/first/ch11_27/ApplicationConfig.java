package com.LSJ.first.ch11_27;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("캠핑");
		hobbys.add("영화보기");

		Student student = new Student("민경훈");
		student.setAge(37);
		student.setHobbys(hobbys);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("운동");
		hobbys.add("음악듣기");

		Student student = new Student("홍시영");
		student.setAge(30);
		student.setHobbys(hobbys);
		
		return student;
	}
}
