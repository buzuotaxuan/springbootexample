package com.l2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.l2.autoinject.ConstructInject;
import com.l2.autoinject.User;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext	ac= new AnnotationConfigApplicationContext(MyConfig.class);
		ac.getBean(ConstructInject.class).show();
		//测试initlizingBean 接口
//		System.out.println(ac.getBean(Cat.class));
		ac.getBean(User.class).show();
		ac.close();
		
	}
}
