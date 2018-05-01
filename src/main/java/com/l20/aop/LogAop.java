package com.l20.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAop {
	@Before("execution(* com.l2..*.*(..))") //织入
	public void log(){
		System.out.println("method log");
	}
}
