package com.l3.beanFactoryPostProcessor;

import org.springframework.stereotype.Component;

@Component
public class Person {
	public void init(){
		System.err.println("user init ");
	}
}
