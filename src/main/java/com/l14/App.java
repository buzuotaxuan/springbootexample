package com.l14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.filter.ApplicationContextHeaderFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * springboot 运行流程分析
 * @author devy
 * 一initialize
 * 1. 判断是否是web 环境
 * 2. 加载 所有 META/spring.factors中的配置实现  ApplicationContextInitializer
 * 3. 加载所有 META/spring.factors中的配置实现 ApplicationListener
 * 4. 推断  运行如果所在类
 * 5. run
 * 6.设置系统变量
 * 7. 执行SpringApplicationRunListeners 注意这个不是上面的ApplicationListener 这个
 * 8.执行所有的 SpringApplicationRunListeners 的sart 方法
 * 9. 实例化 ApplicationArguments 
 * 10. 创建 Environment
 * 11. 根据 传入的args 配置Environment
 * 12. 执行 SpringApplicationRunListeners的environmentPrepared
 * 13. 如果不是web 环境 但是是web 的environment 就把 他转换成标注环境
 * 14.打印banner
 * 15. 初始化ApplicationContext 如果是 web环境 初始化 AnnotationConfigEmbeddedWebApplicationContext 否则实例化 AnnotationConfigApplicationContext
 * 16 如果beanNameGenerator 不为空就把 beanNameGenerator 注入到context 中去
 * 17. 回调所有 2中配置的 ApplicationContextInitializer.initilize 方法
 * 18. SpringApplicationRunListener 的 contextPrepared
 * 19. 注入 ApplicationArguments 和Banner对象
 * 20. 加载所有的源到context 中去 类似于 AnnotationConfigApplicationContext.register(annotaedClass) 方法
 * 21. SpringApplicationRunListener 的 contextLoaded 方法
 * 22.执行 refresh 方法
 * 22. refresh 执行完成后判断需不需要执行shutdown 钩子
 * 23. refresh 后回调所有  META/spring.factors 中的实现 ApplicationRunner CommandLineRunner 接口 根据顺序依次调用
 * 24. SpringApplicationRunListener 的finished
 * 
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
	
		SpringApplication.run(App.class, args);
		
		
	}
}
