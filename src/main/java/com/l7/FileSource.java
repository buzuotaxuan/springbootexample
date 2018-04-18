package com.l7;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
/**
 * 加载外部配置
 * @author devy
 *
 */
@Configuration
@PropertySource("classpath:jdbc.yml") //指定配置文件位置 配合 @Value 进行属性配置文件到类属性中注册
@PropertySource("classpath:ds.yml") //指定配置文件位置 配合 @Value 进行属性配置文件到类属性中注册
public class FileSource {
	
}
