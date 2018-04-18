package com.l2.beanpostprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.l2.autoinject.LogUser;
import com.l2.autoinject.User;
/**
 * 每个bean 初始化的时候都会调用一次
 * @author devy
 *
 */
@Component
public class EchoBeanPostProcess implements BeanPostProcessor{
	/**
	 * 在bean 依赖装配bean完成之后初始化
	 * 可以对在的bean生成动态代理对象
	 */
	
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization");
		if(bean instanceof User){
			return new LogUser();
		}
		return bean;
	}
	/**
	 * 在bean  init 初始化之后触发 如实现 @PostConstruct @Bean(initMethod) 实现InitializingBean 接口
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization");
		return bean;
	}

}
