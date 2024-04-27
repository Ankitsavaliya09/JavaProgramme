package com.kodnest.boot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {

	@GetMapping(value="/create")
	public String create() {
		return "Created";
	}
	
	@GetMapping(value="/read")
	public String read() {
		return "Read";
	}
	
	@GetMapping(value="/update")
	public String update() {
		return "Updated";
	}
	
	@GetMapping(value="/delete")
	public String delete() {
		return "Deleted";
	}
}
