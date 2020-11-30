package com.LSJ.first.ch11_28.Profile11_30;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass_config {
	
	public static void main(String[] args) {
		String config = null;
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(str.equals("dev")) {
			config = "dev";
		}else if(str.equals("run")){
			config = "run";
		}else {
			System.out.println("dev 또는 run 을 입력해주세요!");
		}
		
		scan.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
//		setActiveProfiles -> 어떤 설정파일(프로필)을 사용할지 결정
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(ConfigRun.class, ConfigDev.class);
		ctx.refresh();
		
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.printf("IP = %s / Port = %d \n", info.getIpNum(), info.getPortNum());
		
		ctx.close();
	}
}
