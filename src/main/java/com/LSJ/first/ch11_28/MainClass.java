package com.LSJ.first.ch11_28;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//		컨테이너 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
//		컨테이너 설정
		ctx.load("classpath:Student11_28CTX.xml");
		
//		설정한 후에는 반드시 refresh()를 해줘야한다 -> 컨테이너 초기화
		ctx.refresh();
		
//		컨테이너 사용
		Student student = ctx.getBean("stu", Student.class);
		System.out.printf("이름 = %s, 나이 = %d \n", student.getName(), student.getAge());
		
//		컨테이너 종료 -> 컨테이너가 소멸되면 빈도 소멸된다!!!
		ctx.close();
	}
}
