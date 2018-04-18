package com.l21;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.edu.springboot.EnableRedis;
/**
 * 本次内容为 自定义一个 springboot redis 组件
 * 有两种方式 对 外部 自定义的spring-boot 组建进行引入 第一种是  外部工程 扩展注解引入
 * 如 com.edu.springboot.EnableRedis 这个自定义注解
 * 
 * 第二种是在 自定义的spring-boot 组件中加入META-INF/spring.factories org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.edu.springboot.RedisAutoConfig
 */
@EnableRedis
@SpringBootApplication 
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
		System.out.println(cac.getBean(DataSource.class).getClass()); //注意这里报错 是因为 没有配置正确的链接
	}
}
