package com.l7;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import com.l7.mycondition.EncodingConvert;
import com.l7.mycondition.GBKEncoding;
import com.l7.mycondition.UTF8Encoding;



@SpringBootConfiguration
public class ConfigProperties {

	@Bean
	@ConditionalOnProperty(name="a.url",havingValue="http:test",matchIfMissing=true) //当配置文件中的值等于后面的值的时候 这个类就初始化,如果配置文件中不存在 那么就默认初始化
	public Runnable createRunnable(){
		System.out.println("============");
		return ()->{};
	}
	@Bean
	@ConditionalOnClass(EncodingConvert.class) //当容器中装载了这个bean 的时候进行装载
	public GBKEncoding createGBKEncoding2(){
		return new GBKEncoding();
	}

	@Bean
	@ConditionalOnMissingClass("UTF8Encoding")
	public UTF8Encoding createUTF8Encoding2(){
		return new UTF8Encoding();
	}
}
