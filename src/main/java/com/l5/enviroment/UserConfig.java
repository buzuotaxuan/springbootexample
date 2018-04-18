package com.l5.enviroment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserConfig {
   @Autowired
   private Environment environment;
   
   @Value("${local.port}")
   private int port;
   
   @Value("${tomcat.port:9090}") //设置默认值, 如果配置文件中没有这个参数 那么就用默认值9090
   private int defaultValue;
   
   public void show(){
	   System.out.println(environment.getProperty("local.ip"));
	   System.out.println("port" + port);
	   System.out.println("defaultValue:" + defaultValue);
   }
}
