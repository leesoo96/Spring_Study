package com.LSJ.first.ch11_28.Profile11_30;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
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
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("Str_devCTX.xml", "Str_runCTX.xml");
		ServerInfo info = ctx.getBean("serverinfo", ServerInfo.class);
		System.out.printf("IP = %s / Port = %d", info.getIpNum(), info.getPortNum());
		
		ctx.close();
	}
}
