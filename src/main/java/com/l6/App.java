package com.l6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * 
 * @author devy
 * 如果想改变配置文件名字可是使用启动参数 --spring.confg.name
 * 
 * 如果想改变配置文件路径可以使用 --spring.config.location
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
	
		System.out.println(cac.getEnvironment().getProperty("password"));
		cac.close();
		
	}
}
