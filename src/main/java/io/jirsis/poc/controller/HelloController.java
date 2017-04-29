package io.jirsis.poc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${message:internal}")
	private String message;
	
	@RequestMapping(path="/hello")
	public ResponseEntity<HelloResponse> getAllMessages(){
		HelloResponse response = new HelloResponse();
		response.setMessage(message);
		return ResponseEntity.ok(response);
	}

}
