package com.LSJ.first.ch11_28.Enviornment;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean{

	private Environment env;
	private String adminId;
	private String adminPw;
	
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	@Override // 빈 소멸 시점에서 호출
	public void destroy() throws Exception {
		System.out.println("destroy 호출");	
		System.out.println("빈이 소멸되었습니다.");
	}

	@Override // 빈 초기화 시점에서 호출
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet 호출");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}

	@Override 
	public void setEnvironment(Environment env) {
		System.out.println("setEnvironment 호출");
		setEnv(env); 
	}	
/* 	setEnvironment(Environment env) => 
  	빈의 시작점에서 호출되는데, 
	InitializingBean, DisposableBean보다 EnvironmentAware가 더 우선시되어 호출된다
	환경변수 관련이기때문!
*/
	}
