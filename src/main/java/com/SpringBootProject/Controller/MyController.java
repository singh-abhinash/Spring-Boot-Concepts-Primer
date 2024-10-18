package com.SpringBootProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class MyController {
	
	@GetMapping("/firstapi")
	public String getData() {
		return "This is my first API";
	}
}

