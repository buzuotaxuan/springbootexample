package com.l5.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcProperties {
	@Value("${a.url}")
	private String url;
	@Value("${a.driverClass}")
	private String driverClass;
	
	public void show(){
		System.out.println("url:"+this.url+"driverClass:"+this.driverClass);
	}
}
