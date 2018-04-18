package com.l18.tomcat;

import java.io.File;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;
@Component
public class MyTomcat implements EmbeddedServletContainerCustomizer{

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		TomcatEmbeddedServletContainerFactory tomcat=(TomcatEmbeddedServletContainerFactory)container;
		tomcat.setPort(9090);
		tomcat.setBaseDirectory(new File("D://LOGS/"));
		tomcat.addContextValves(getAccessLogValve());
		tomcat.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
	}
	
	private AccessLogValve getAccessLogValve() {
		AccessLogValve log=new AccessLogValve();
		log.setDirectory("D://LOGS/");
		log.equals(true);
		log.getPattern();
		log.setPrefix("spring boot");
		return log;
	}
	
	class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer{

		@Override
		public void customize(Connector connector) {
			System.out.println(connector.getProtocolHandler().getClass());  
			Http11NioProtocol protocal=(Http11NioProtocol)connector.getProtocolHandler();
			protocal.setMaxConnections(2000);  //设置tomcat 连接数 调优会用到
			protocal.setMaxThreads(500);
		}
		
	}
}
