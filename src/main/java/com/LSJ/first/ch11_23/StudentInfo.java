package com.LSJ.first.ch11_23;

public class StudentInfo {

	private Student student;
	
	public StudentInfo(Student student) {
		this.student = student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	public void getStudentInfo() {
		if(student != null) {
			System.out.printf("%s 학생은 %s살이고 %s학년 %s반 입니다.%n", 
					           student.getName(), student.getAge(), 
					           student.getGrade(), student.getStudent_Class()
					         );
		}
	}
}
