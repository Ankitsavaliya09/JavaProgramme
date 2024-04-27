package com.kodnest.boot01.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBoot {

	@GetMapping(value="/greet")
	public String greet() {
		return "Hi, Hello, How are you?";
	}
}
