package com.l1.initializBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean,DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("cat bean init finished");
	}

	@Override
	public void destroy() throws Exception {
		 System.out.println("cat bean init destoryed");
		
	}

}
