package com.l17;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@ExceptionHandler
	public String home(Exception e){
		return e.getMessage();
	}
	@GetMapping("/user/home")
	public String home(){
		return "user home";
	}
	
	@GetMapping("/book/home")
	public String book(){
		return "book home";
	}
}
