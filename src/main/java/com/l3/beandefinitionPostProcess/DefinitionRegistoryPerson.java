package com.l3.beandefinitionPostProcess;

public class DefinitionRegistoryPerson {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init(){
		System.err.println("user init ");
	}
}
