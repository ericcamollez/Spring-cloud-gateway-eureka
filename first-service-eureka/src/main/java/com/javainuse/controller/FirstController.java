package com.javainuse.controller;

import org.springframework.web.bind.annotation.*;

// http://localhost:8082/employee/message

@RestController
@RequestMapping("/employee")
public class FirstController {

	@GetMapping("/message")
	public String test() {
		return "Hello JavaInUse Called in First Service";
	}
}
