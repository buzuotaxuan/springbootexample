package com.l2.autoinject;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class User {

	@PostConstruct
	public void init(){
		System.out.println("user init .....");
	}
	
	public void show(){
		System.out.println(this +" i parent user");
	}
}
