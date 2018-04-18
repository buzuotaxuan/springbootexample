package com.l7.mycondition;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootConfiguration
public class EncodingConverConfig {

	@Bean
	@Conditional(UTF8Condition.class)
	public EncodingConvert createUTF8Convert(){
		return new UTF8Encoding();
	}
	@Bean
	@Conditional(GBKCondition.class)
	public EncodingConvert createGBKConvert(){
		return new GBKEncoding();
	}
}
