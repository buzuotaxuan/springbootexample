package com.l16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * servlet listener filter 第一种 原生的  @ServletComponentScan 方式 必须要用 servlet 3.0包 
 * 
 * 第二种 用springboot 的方式 见 com.l16.sringboot.servlet这个包
 * @author devy
 *
 */
@ServletComponentScan//自定义servlet 要用到这个注解 把自己定义的servlet 加入到spring 容器中
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
		
	}
}
