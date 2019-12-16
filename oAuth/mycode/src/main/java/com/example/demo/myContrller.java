package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myContrller {
	@RequestMapping("/public")
public String publicData()
{
		return "public";
}
	@RequestMapping("/private")
public String privateData()
{
		return "private";
}
}
