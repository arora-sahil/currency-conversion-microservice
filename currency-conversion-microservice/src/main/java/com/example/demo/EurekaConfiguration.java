package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("eureka.client.service-url")
public class EurekaConfiguration {
	
	String defaultZone;
	int port;
	
	@Profile("dev")
	@Bean
	public String devEurekaConfig()
	{
		System.out.println(defaultZone);
		return "----------------------------------Dev Eureka Connection--------------------------------------------";
	}
	
	@Profile("default")
	@Bean
	public String defaultEurekaConfig()
	{
		System.out.println(defaultZone);
		System.out.println(port);

		return "----------------------------------------Default Eureka Connection------------------------------------";
	}
	
	

}
