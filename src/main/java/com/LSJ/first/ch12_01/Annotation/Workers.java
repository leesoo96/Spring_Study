package com.LSJ.first.ch12_01.Annotation;

public class Workers {
	private String name;
	private int age;
	private String job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public void getWorkerInfo() {
		System.out.printf("이름 = %s, 나이 = %d, 직업 = %s \n", 
				   		   getName(), getAge(), getJob());
	}
}
