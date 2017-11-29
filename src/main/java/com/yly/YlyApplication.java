package com.yly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.yly" })
public class YlyApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(YlyApplication.class, args);
	}
}
