package com.quiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController 
{
	@GetMapping("/msg")
	public String getMessage()
	{
		return "prakruti";
	}
}
