package com.l16.sringboot.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
public class StartUpListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("========= init ");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
