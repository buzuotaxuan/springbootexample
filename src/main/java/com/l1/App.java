package com.l1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.l1.c.MyBean;
import com.l1.factorybean.FactoryBeanTest;
import com.l1.factorybean.MyFactoryBean;
import com.l1.initializBean.Cat;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext	ac= new AnnotationConfigApplicationContext(MyConfig.class);
		MyBean my=ac.getBean(MyBean.class);
		System.out.println(my);
		//FactoryBeanTest 
		MyFactoryBean myf=(MyFactoryBean)ac.getBean("createMyFacotryBeanTest");
		myf.getName();
		// 用factoryBean 初始化的bean的时候 如果想要获取factorybean 接口 可以在前面加上&
		FactoryBeanTest myft=(FactoryBeanTest)ac.getBean("&createMyFacotryBeanTest");
		System.out.println(myft);
		
		//测试initlizingBean 接口
//		System.out.println(ac.getBean(Cat.class));
		ac.close();
		
	}
}
