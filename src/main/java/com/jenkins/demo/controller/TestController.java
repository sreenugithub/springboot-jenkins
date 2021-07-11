package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
@GetMapping("/messages")
public String getMessage() {
	
	return "SpringBoot project with Docker test ...";
	
}
 }
