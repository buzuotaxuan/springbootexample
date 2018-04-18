package com.l20.aop;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * 可以通过在配置文件中 使用spring.aop.auto= false 关闭aop 默认是开启的
 */
@SpringBootApplication 
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
	}
}
