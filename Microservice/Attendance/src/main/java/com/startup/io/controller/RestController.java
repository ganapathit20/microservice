package com.startup.io.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1")
public class RestController {
	
	@GetMapping(value = "/allInfo")
	public String getAllInformation(){
		
		return "it is working attedance";
		
	}
}
