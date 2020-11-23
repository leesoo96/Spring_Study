package com.LSJ.first.ch11_23;

public class Student {
	private String name;
	private String age;
	private String grade;
	private String student_Class;
	
	public Student(String name, String age, String grade, String studet_Class) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.student_Class = studet_Class;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getStudent_Class() {
		return student_Class;
	}
	public void setStudent_Class(String student_Class) {
		this.student_Class = student_Class;
	}
	
	
}
