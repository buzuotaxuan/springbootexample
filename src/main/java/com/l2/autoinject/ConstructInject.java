package com.l2.autoinject;

import org.springframework.stereotype.Component;

/**
 * 4.3 新特性 可以根据容器 自动匹配构造 构造参数 只要容器中存在就可以注入
 * @author devy
 *
 */
@Component
public class ConstructInject {
	
	private User user;
	private Book book;
	public ConstructInject(User user,Book book){
		this.user=user;
		this.book=book;
				
	}
	
	public void show(){
		System.out.println(this.user+"0000000"+this.book);
	}
}
