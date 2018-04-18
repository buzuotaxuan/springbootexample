package com.l4;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
//这里注意 通常来说 要用@configration 联合 @ComponentScan 进行装配 但是springboot 的入口类包含
//了 @configration 的功能
@ComponentScan
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, null);
	}
}
