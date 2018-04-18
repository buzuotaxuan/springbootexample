package com.l17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
/**
 * 实现异常通用处理的方式 第一种  排除默认springboot 自带的错误处理页面 配合 ErrorPageRegistrar 接口实现自定义页面 如
 * com.l17.customererrorpage.CommonErrorPage 注意要加上 @Component 注解
 * 	第二种  通过 @ExceptionHandler 在controller 中 但是只能处理当前的Controller
 * 第三种是 全局的 @ControllerAdvice 加上  @ExceptionHandler  优先使用controller 内部资金的exception
 */
@SpringBootApplication //排除默认springboot 自带的错误处理页面 配合 ErrorPageRegistrar 接口实现自定义页面 自定义的错误异常 会覆盖 springboot 自带的
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
		
	}
}
