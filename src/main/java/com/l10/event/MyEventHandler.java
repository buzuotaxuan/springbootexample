package com.l10.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {
	/**
	 * 参数任意 所有参数时间 及其子事件都可以接收到	
	 * @param event
	 */
	@EventListener
	public void event(MyApplicationEvent event){
		System.out.println("evvvvvv"+event.getClass());
	}
}
