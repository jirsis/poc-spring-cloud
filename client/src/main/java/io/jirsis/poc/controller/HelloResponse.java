package io.jirsis.poc.controller;

import lombok.Data;

@Data
public class HelloResponse {
	
	private String message;
	private String secret;
	
	private String application;

}
