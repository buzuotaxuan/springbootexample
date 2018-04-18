package com.l1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.l1.c.MyBean;
import com.l1.factorybean.FactoryBeanTest;
import com.l1.initializBean.Cat;
import com.l1.initializBean.Dog;

@Configuration
public class MyConfig {
	//初始化Bean 默认是返回类型  其次是 方法名称
	@Bean
	public MyBean createBean(){
		return new MyBean();
	}
	@Bean 
	public FactoryBeanTest createMyFacotryBeanTest(){
		return new FactoryBeanTest();
	}
	
	@Bean
	public Cat createCat(){
		return new Cat();
	}
	
	@Bean(initMethod="init",destroyMethod="destory")
	public Dog createDog(){
		return new Dog();
	}
	
}
