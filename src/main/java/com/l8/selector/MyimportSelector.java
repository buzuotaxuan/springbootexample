package com.l8.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import com.l8.Department;

public class MyimportSelector implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
				
				System.out.println(importingClassMetadata.getAnnotationAttributes(EnableLog.class.getName()));
		return new String []{Department.class.getName()};
	}

}
