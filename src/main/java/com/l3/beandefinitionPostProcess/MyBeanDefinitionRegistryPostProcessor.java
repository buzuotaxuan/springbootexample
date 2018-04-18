package com.l3.beandefinitionPostProcess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;
/**
 * 动态注入bean 相当于@component  @Service @Repository等注解不过那些是静态的
 * @author devy
 *
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("=============");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		for (int i = 0; i < 10; i++) {
			//设置我们要动态生成的类是基于那个对象的
			BeanDefinitionBuilder bdb=BeanDefinitionBuilder.rootBeanDefinition(DefinitionRegistoryPerson.class);
			bdb.addPropertyValue("name", "admin"+i);
			registry.registerBeanDefinition("DefinitionRegistoryPerson"+i, bdb.getBeanDefinition());
		}
	}

}
