package com.mdm.service;

import org.springframework.stereotype.Service;

import com.mdm.vo.TestAop;

@Service
public class TestService {
	public String request(TestAop aop){
		System.out.println("=======");
		return "------";
	}
}
