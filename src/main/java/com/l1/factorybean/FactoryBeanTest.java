package com.l1.factorybean;

import org.springframework.beans.factory.FactoryBean;
//factoryBean 接口主要负责初始化其他bean
public class FactoryBeanTest implements FactoryBean<MyFactoryBean>{

	@Override
	public MyFactoryBean getObject() throws Exception {
		return new MyFactoryBean();
	}

	@Override
	public Class<?> getObjectType() {
		return MyFactoryBean.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
