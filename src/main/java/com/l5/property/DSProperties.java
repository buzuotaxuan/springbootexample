package com.l5.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="ds")//如果不指定location 会默认在application 中找
public class DSProperties {
	private String a;
	
	private String b;
	
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public void show(){
		System.out.println("ip"+this.getA()+"port"+this.getB());
	}
}
