package com.l18.tomcat;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootConfiguration
public class TomcatConfigration {
	@Bean
	public EmbeddedServletContainerFactory createTomcatEmbeddedServletContainerFactory(){
		TomcatEmbeddedServletContainerFactory tomcat =new TomcatEmbeddedServletContainerFactory();
		tomcat.addInitializers((servletContext)->{
			System.out.println("========servlet startup=");
		});
		tomcat.setPort(10008);
		tomcat.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));
		return tomcat;
	}
}
