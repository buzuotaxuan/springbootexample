package com.l11.commandlinerrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/**
 * 
 * @author devy
 * 是在容器启动成功之后的最后一步回调
 * 多个的话可以通过@order 指定执行顺序 order 的值越大执行越靠后
 */
@Component
public class ServersuccessReport implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=======应用已经成功启动"+args[0]);
	}

}
