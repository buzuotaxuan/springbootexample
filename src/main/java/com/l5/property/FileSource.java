package com.l5.property;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
/**
 * 加载外部配置
 * @author devy
 *
 */
@Configuration
@PropertySources(value={
		@PropertySource("classpath:jdbc.yml"), //指定配置文件位置 配合 @Value 进行属性配置文件到类属性中注册
		@PropertySource("classpath:ds.yml") //指定配置文件位置 配合 @Value 进行属性配置文件到类属性中注册
})
public class FileSource {
	
}
