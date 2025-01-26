package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceB {
	
	
	@GetMapping("/v1/serviceB")
		String display() {
		return "Message from Service-B";
		}
	
	@GetMapping("/api/resource")
	String getData() {
		return "Calling from Service-A to Service B";
		}
	
	}
	

