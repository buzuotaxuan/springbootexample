package com.mdm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mdm.service.TestService;
import com.mdm.vo.Test;
import com.mdm.vo.TestAop;

@RestController
public class TestController {
	@Autowired
	RestTemplate  restTemplate;
	@Autowired
	TestService testService;
	@GetMapping("/test")
	public String test(){
		TestAop aop=new TestAop();
		aop.setCityCode("001");
		aop.setName("城市");
		Test t=new Test();
		t.setDept("1");
		t.setPhone("2");
		
		this.restTemplate.getForObject("http://localhost:8080/test2", Object.class);
		return "";
	}
	
	@PostMapping("/posttest")
	@ResponseBody
	public TestAop posttest(@RequestBody TestAop testAop){
		TestAop aop=new TestAop();
		aop.setCityCode("001");
		aop.setName("城市");
		Test t=new Test();
		t.setDept("1");
		t.setPhone("2");
		
//		this.restTemplate.getForObject("http://localhost:8080/test2", Object.class);
		return aop;
	}
	
	
	@GetMapping("/test2")
	public String test2(TestAop t){
		TestAop aop=new TestAop();
		aop.setCityCode("001");
		aop.setName("城市");
		this.restTemplate.postForObject("http://localhost:8080/posttest", aop, TestAop.class);
		return "";
	}
	@GetMapping("/test3")
	public String test3(){
		Map<String,String> map=new HashMap<>();
		map.put("cityCode", "007");
		map.put("name", "测试");
		this.restTemplate.getForObject("http://localhost:8080/test2{?map}", Object.class, map);
		return "";
	}
}
