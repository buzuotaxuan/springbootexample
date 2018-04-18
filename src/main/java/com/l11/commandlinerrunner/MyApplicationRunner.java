package com.l11.commandlinerrunner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
/**
 * ApplicationRunner 和CommandLineRunner 功能一样 只是 springboot 进一步封装
 * @author devy
 * 是在容器启动成功之后的最后一步回调
 * 多个的话可以通过@order 指定执行顺序 order 的值越大执行越靠后
 */
@Component
public class MyApplicationRunner implements ApplicationRunner{


	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("启动参数为:"+Arrays.deepHashCode(args.getSourceArgs()));
	}

}
