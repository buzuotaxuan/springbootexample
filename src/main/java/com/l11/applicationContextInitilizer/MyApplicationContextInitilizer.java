package com.l11.applicationContextInitilizer;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
//容器执行refresh之前的回调
public class MyApplicationContextInitilizer implements ApplicationContextInitializer<ConfigurableApplicationContext>{

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("bean count:"+ applicationContext.getBeanDefinitionCount());
		//获取beanFactory 同时可以获取bean 可以对bean 做一些操作
		ConfigurableListableBeanFactory bf=applicationContext.getBeanFactory();
		
		
		
	}

}
