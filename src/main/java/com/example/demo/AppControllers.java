package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppControllers {
	
	@GetMapping("/msg")
	public String getMsg() {
		int a = 10;
		String b = "abhishek";
		return "hai kiran with abhishek";
	}

}
