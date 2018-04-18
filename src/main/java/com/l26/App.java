package com.l26;

import java.util.Collection;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;
/**
 * 使用 zookeeper 作为服务发现组件
 */
@SpringBootApplication 
public class App {
	@Autowired
	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class, args);
//		System.out.println(cac.getBean(DataSource.class).getClass()); //注意这里报错 是因为 没有配置正确的链接
		
		//模拟客户端获取连接
		CuratorFramework  client =CuratorFrameworkFactory.newClient("zkurl", new RetryOneTime(1000));
		client.start();
		try {
			client.blockUntilConnected();
			ServiceDiscovery<Object> serviceDiscovery=ServiceDiscoveryBuilder.builder(Object.class).client(client).basePath("/soa").build();
			
		Collection<ServiceInstance<Object>> list=serviceDiscovery.queryForInstances("product");
		for (ServiceInstance<Object> serviceInstance : list) {
			RestTemplate restTemplate=new RestTemplate();
			restTemplate.getForEntity("http://"+serviceInstance.getAddress()+":"+serviceInstance.getPort(), Object.class);
		}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
