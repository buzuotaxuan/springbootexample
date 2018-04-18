package com.l9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.configration.Flower;


@ComponentScan
@EnableAutoConfiguration //@EnableAutoConfiguration 搜索classpath 下所有 配置在 中的类	META-INF/spring.factories  把值放入到spring容器中
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
		System.out.println(cac.getBean(Flower.class));
		cac.close();
		
	}
}
