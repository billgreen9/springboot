package com.youku.yklive.springboot;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

//@SpringBootApplication
public class AppWar extends SpringBootServletInitializer{
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(Application.class);
	}

//	public static void main(String[] args) {
//		SpringApplication.run(AppWar.class, args);
//	}

}
