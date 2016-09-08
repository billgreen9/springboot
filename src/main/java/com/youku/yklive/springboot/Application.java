package com.youku.yklive.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SuppressWarnings("deprecation")
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
public class Application  {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
