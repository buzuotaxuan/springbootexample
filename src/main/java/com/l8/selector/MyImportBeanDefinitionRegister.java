package com.l8.selector;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.l8.Table;

public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar{

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder bdb=BeanDefinitionBuilder.rootBeanDefinition(Table.class);
		bdb.addPropertyValue("name", "admin");
		registry.registerBeanDefinition("Table", bdb.getBeanDefinition());
	}

}
