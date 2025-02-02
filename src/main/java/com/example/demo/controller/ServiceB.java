package com.example.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ServiceB")
public class ServiceB {
	
	
	@GetMapping("/v1/serviceB")
		String display() {
		return "Message from Service-B";
		}
	
	@GetMapping("/api/resource")
	String getData() {
		return "Calling from Service-A to Service B";
		}
	@GetMapping("/v1/ip")
	 public Map<String, String> getIpAddress() {
       Map<String, String> response = new HashMap<>();
       try {
           // Get the local IP address of the ECS task
           String ipAddress = InetAddress.getLocalHost().getHostAddress();
           response.put("ipAddress", ipAddress);
       } catch (UnknownHostException e) {
           response.put("error", "Failed to get IP address: " + e.getMessage());
       }
       return response;
   }
	
	}
	

