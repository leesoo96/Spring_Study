package com.LSJ.first.ch11_28;

import javax.annotation.*;

public class OtherStudent {

	private String name;
	private int age;
	
	public OtherStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
/*	@PostConstruct - 빈 초기화 과정에서 호출(refresh())
	public void initMethod() {
		System.out.println("initMethod");
	}
	
	@PreDestory - 빈 소멸 과정에서 호출(close())
	public void destoryMethod() {
		System.out.println("destoryMethod");
	}
*/
}
