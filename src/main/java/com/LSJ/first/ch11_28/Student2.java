package com.LSJ.first.ch11_28;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student2 implements InitializingBean, DisposableBean {

	private String name;
	private int age;
	
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	빈 소멸 과정에서 호출된다 - close()
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

//	빈 초기화 과정에서 호출된다 - refresh()
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

}
