package com.l11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * 容器执行refresh之前的回调
 * @author devy
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
	
		SpringApplication app= new SpringApplication(App.class);
//		app.addInitializers(new MyApplicationContextInitilizer()); //注册执行方法1  
																    //注册方法二 可以 通过在application.yml 中加入context.initializer.classes=com.l11.applicationContextInitilizer.MyApplicationContextInitilizer
																	//注意如果有多个 可以用逗号分隔
																	//第三种方式 在 spring.factories 中添加org.springframework.context.ApplicationContextInitializer=com.l11.applicationContextInitilizer.MyApplicationContextInitilizer
		ConfigurableApplicationContext context=app.run("haha");
		 context.close();
		
	}
}
