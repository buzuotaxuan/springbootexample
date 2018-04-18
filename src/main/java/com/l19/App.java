package com.l19;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * 这里现在报错 是因为 没有引入jar包  在pom 中注释了
 * 自定义tomcat方法一 实现 EmbeddedServletContainerCustomizer 接口 然后加上@Component 注解
 * 
 * 第二种 自定义tomcat方法  EmbeddedServletContainerFactory  配合 @SpringBootConfiguration注解    如com.l18.tomcat.TomcatConfigration
 */
@SpringBootApplication 
//@EnableTransactionManagement //启用事物  配合transction 注解使用  
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
		System.out.println(cac.getBean(DataSource.class).getClass()); //注意这里报错 是因为 没有配置正确的链接
	}
}
