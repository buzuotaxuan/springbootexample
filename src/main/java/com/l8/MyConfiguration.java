package com.l8;

import org.springframework.context.annotation.Bean;
// 注意这里的注入bean 容器是通过@Import 的方式所以 这里没有加入@Configuration也可
public class MyConfiguration {
	
	@Bean
	public Role createRole(){
		return new Role();
	}
}
