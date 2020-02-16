package com.example.firstms.demo;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class MainController {
	
	@RequestMapping("add/{number1}/{number2}")
	public int add(@PathVariable("number1") int number1,@PathVariable("number2") int number2,final HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");	
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		return number1+number2;
	}
	
	@RequestMapping("sub/{number1}/{number2}")
	public int sub(@PathVariable("number1") int number1,@PathVariable("number2") int number2,final HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");	
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		return number1-number2;
	}
	
	@RequestMapping("multiply/{number1}/{number2}")
	public int multiply(@PathVariable("number1") int number1,@PathVariable("number2") int number2,final HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");	
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		return number1*number2;
	}
	
	@RequestMapping("divide/{number1}/{number2}")
	public int divide(@PathVariable("number1") int number1,@PathVariable("number2") int number2,final HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");	
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		return number1/number2;
	}
	
}
