package com.l10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.config.DelegatingApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.context.event.EventListenerMethodProcessor;

import com.configration.Flower;
import com.l10.event.MyApplicationEvent;
import com.l10.listener.Mylistenser;

// 主要看 DelegatingApplicationListener这个类  EventListenerMethodProcessor
// springcontext 包中有很多event
@ComponentScan
@EnableAutoConfiguration //@EnableAutoConfiguration 搜索classpath 下所有 配置在 中的类	META-INF/spring.factories  把值放入到spring容器中
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
		//cac.addApplicationListener(new Mylistenser()); //设置自定义的监听事件  2 还可以通过把这个类用@Component 标注
														//3 通过在application.properties配置项  context.listener.classes= com.l10.listener.Mylistenser
														//还可以通过 @EventListener 如com.l10.event.MyEventHandler 写法
		System.out.println(cac.getBean(Flower.class));
		cac.publishEvent(new MyApplicationEvent(new Object()));
		cac.close();
		
	}
}
