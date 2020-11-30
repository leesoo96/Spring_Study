package com.LSJ.first.ch11_28.Profile11_30;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ConfigDev {
	
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		info.setIpNum("123.0.0.1");
		info.setPortNum(8070);
		
		return info;
	}
}
