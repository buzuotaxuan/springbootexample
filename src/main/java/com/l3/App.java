package com.l3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.l3.beandefinitionPostProcess.DefinitionRegistoryPerson;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext	ac= new AnnotationConfigApplicationContext(MyConfig.class);
		ac.getBeansOfType(DefinitionRegistoryPerson.class).values().forEach(System.out::println);
		ac.close();
		
	}
}
