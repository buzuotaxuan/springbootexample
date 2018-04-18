package com.l3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.l3.beanFactoryPostProcessor.Person;

@Configuration
@ComponentScan("com.l3")
public class MyConfig {
	@Bean(initMethod="init")
	public Person createUser(){
		return new Person();
	}
	
	@Bean(initMethod="init")
	public Person createUser2(){
		return new Person();
	}
}
