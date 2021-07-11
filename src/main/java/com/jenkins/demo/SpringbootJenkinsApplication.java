package com.jenkins.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJenkinsApplication {
	
	static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplication.class);
	
	
	@PostConstruct
	public void intt() {
		logger.info("SpringbootJenkinsApplication  started ...... ");
	}
			
			
	
	public static void main(String[] args) {
		
		logger.info("Application  Executing ...... ");

		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
