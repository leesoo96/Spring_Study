package com.LSJ.first.ch11_28.Profile11_30;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ConfigRun {
	
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		info.setIpNum("111.0.0.1");
		info.setPortNum(8090);
		
		return info;
	}
}
