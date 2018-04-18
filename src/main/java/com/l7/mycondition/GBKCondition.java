package com.l7.mycondition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GBKCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		
		String utf8=context.getEnvironment().getProperty("utf-8");
		System.out.println(context.getEnvironment().getProperty("a.url"));
		if(!"true".equals(utf8)){
			return true;
		}
		return false;
	}

}
