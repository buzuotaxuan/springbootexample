package com.l5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.l5.enviroment.UserConfig;
import com.l5.property.DSProperties;
import com.l5.property.JdbcProperties;
/**
 * 这个包主要是讲解读取配置文件
 * @author devy
 * 如果想改变配置文件名字可是使用启动参数 --spring.confg.name
 * 
 * 如果想改变配置文件路径可以使用 --spring.config.location
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
		//第一种获取配置文件值的方式
		System.out.println(cac.getEnvironment());
		System.out.println(cac.getEnvironment().getProperty("local.ip"));
		//第二种获取配置文件的方式
		 UserConfig uc=cac.getBean(UserConfig.class);
		 uc.show();
		//第三种读取外部文件的方式加载配置文件
		 cac.getBean(JdbcProperties.class).show();
		 //第四种制定前缀
		 cac.getBean(DSProperties.class).show();
		 cac.close();
		
	}
}
