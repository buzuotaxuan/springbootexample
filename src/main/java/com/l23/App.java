package com.l23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * spring 自定义监控   实现  HealthIndicator接口 并且纳入管理中
 */
@SpringBootApplication 
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
//		System.out.println(cac.getBean(DataSource.class).getClass()); //注意这里报错 是因为 没有配置正确的链接
	}
}
