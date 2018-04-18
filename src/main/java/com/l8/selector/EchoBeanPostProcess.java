package com.l8.selector;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/**
 * 每个bean 初始化的时候都会调用一次
 * @author devy
 *
 */
public class EchoBeanPostProcess implements BeanPostProcessor{
	 private List<String> packages;
	
	public List<String> getPackages() {
		return packages;
	}
	public void setPackages(List<String> packages) {
		this.packages = packages;
	}
	/**
	 * 在bean 依赖装配bean完成之后初始化
	 * 可以对在的bean生成动态代理对象
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		for (String string : packages) {
			if(bean.getClass().getName().startsWith(string)){
				System.out.println("bean echo:"+bean.getClass().getName());
			}
		}
		return bean;
	}
	/**
	 * 在bean  init 初始化之后触发 如实现 @PostConstruct @Bean(initMethod) 实现InitializingBean 接口
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

}
