package com.l8.selector;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class EchoImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar{

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		Map<String, Object> maps =importingClassMetadata.getAnnotationAttributes(EnableEcho.class.getName());
		BeanDefinitionBuilder bdb=BeanDefinitionBuilder.rootBeanDefinition(EchoBeanPostProcess.class);
		bdb.addPropertyValue("packages", Arrays.asList((String[])maps.get("packages")));
		registry.registerBeanDefinition(EchoBeanPostProcess.class.getName(), bdb.getBeanDefinition());
	}

}
