package com.l6.enviromentpostprocessor;

import java.util.Properties;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

/**
 * 如果要让 这个类生效 必须在META-INF/spring.factories 下面配置
 * org.springframework.boot.env.EnvironmentPostProcessor=com.l6.enviromentpostprocessor.MyEnviromentPostProcessor
 * @author devy
 *
 */
public class MyEnviromentPostProcessor implements EnvironmentPostProcessor{

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		Properties source=new Properties();
		source.setProperty("name", "admin");
		source.setProperty("password", "admin");
		PropertiesPropertySource propertiesPropertySource=new PropertiesPropertySource("my", source);
		environment.getPropertySources().addLast(propertiesPropertySource);
		 System.out.println("============postProcessEnvironment");
	}

}
