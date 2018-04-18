package com.l8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.l8.selector.EnableEcho;
import com.l8.selector.EnableLog;
import com.l8.selector.MyImportBeanDefinitionRegister;

/**
 * 
 使用@Import 注解 可以把一个类引入到容器 中管理 类似于 @Compent @Service 等的功能
	@Import 可以导入类，也可以导入 configuration，还可以通过 自定义ImportSelector 还可以通过 ImportBeanDefinitionRegistrar
	ImportSelector,ImportBeanDefinitionRegistrar 可以结合注解使用 
 */
@SpringBootApplication
@Import(value= {User.class,MyConfiguration.class,MyImportBeanDefinitionRegister.class})
@EnableLog(name="test")
@EnableEcho(packages={"com.l8.bean"})
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
		System.out.println(cac.getBean(User.class));
		System.out.println(cac.getBean(Role.class));
		System.out.println(cac.getBean(Department.class));
		System.out.println(cac.getBean(Table.class));
		cac.close();
		
	}
}
