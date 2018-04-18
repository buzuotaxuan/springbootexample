package com.l16.sringboot.servlet;

import java.util.Arrays;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
/**
 * 通过springboot 方式注入servlet, filter, listener
 * @author devy
 *
 */
@SpringBootConfiguration
public class ServletConfiguration {
	@Bean
	public ServletRegistrationBean createBookServlet() {
	return 	new ServletRegistrationBean(new BookServlet(), "/book");
	}
	@Bean
	public FilterRegistrationBean createEchoFilter(){
		FilterRegistrationBean filter= new FilterRegistrationBean();
		filter.setFilter(new EchoFilter());
		filter.setUrlPatterns(Arrays.asList("/book"));
		return filter;
	}
	@Bean
	public ServletListenerRegistrationBean<StartUpListener> createListener(){
		ServletListenerRegistrationBean<StartUpListener> ls=new ServletListenerRegistrationBean<StartUpListener>(new StartUpListener());
		return ls;
	}
}
