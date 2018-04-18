package com.l17.globelexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobelException {
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public String home(Exception e){
		return e.getMessage();
	}
}
