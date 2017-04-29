package io.jirsis.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@Autowired
	private Environment env;
	
	@Value("${message:internal}")
	private String message;
	
	@Value("${cipher:none}")
	private String secret;
	
	@RequestMapping(path="/hello")
	public ResponseEntity<HelloResponse> getAllMessages(){
		HelloResponse response = new HelloResponse();
		response.setMessage(message);
		response.setSecret(secret);
		response.setApplication(env.getProperty("spring.application.name"));
		return ResponseEntity.ok(response);
	}

}
