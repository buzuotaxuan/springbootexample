package com.l18;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * 自定义tomcat方法一 实现 EmbeddedServletContainerCustomizer 接口 然后加上@Component 注解
 * 
 * 第二种 自定义tomcat方法  EmbeddedServletContainerFactory  配合 @SpringBootConfiguration注解    如com.l18.tomcat.TomcatConfigration
 */
@SpringBootApplication  
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
		
		
	}
}
