package com.swa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Student-Info.properties")
public class Config {
    
	@Bean
	public Address add() {
		
		return new Address();
	}
	
	
	@Bean(name = {"stuu","yes"})
	public Student stu() {
		
		return new Student();
	}
	
}
