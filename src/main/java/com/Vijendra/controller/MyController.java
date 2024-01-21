package com.Vijendra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/message")
	public String printmsg()
	{
		return "WelCome to Rest Api";
	}

}
