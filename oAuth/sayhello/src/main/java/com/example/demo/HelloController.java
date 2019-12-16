package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class HelloController {

	@RequestMapping("/hello")
	public String say()
	{
		return "hello";
	}
}
