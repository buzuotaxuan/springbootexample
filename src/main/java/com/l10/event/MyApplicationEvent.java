package com.l10.event;

import org.springframework.context.ApplicationEvent;
/**
 * 定义事件
 * @author devy
 *
 */
public class MyApplicationEvent extends ApplicationEvent{

	public MyApplicationEvent(Object source) {
		super(source);
		
	}

}
