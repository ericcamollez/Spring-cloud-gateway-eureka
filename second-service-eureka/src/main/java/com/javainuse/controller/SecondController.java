package com.javainuse.controller;

import org.springframework.web.bind.annotation.*;

// http://localhost:8083/consumer/message

@RestController
@RequestMapping("/consumer")
public class SecondController {

	@GetMapping("/message")
	public String test() {
		return "Hello JavaInUse Called in Second Service";
	}
}
