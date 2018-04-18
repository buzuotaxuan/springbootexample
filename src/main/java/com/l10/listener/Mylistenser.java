package com.l10.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.l10.event.MyApplicationEvent;
/**
 * 监听器 鉴定自定义的 事件
 * @author devy
 *
 */

//@Component
public class Mylistenser implements ApplicationListener<MyApplicationEvent>{

	@Override
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println(" my listern receive  "+event.getClass());
	}

}
