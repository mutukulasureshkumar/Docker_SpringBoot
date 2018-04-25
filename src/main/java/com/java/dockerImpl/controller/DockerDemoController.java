package com.java.dockerImpl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {

	
	@GetMapping
	public String get(){
		return "Its Docker Demo Controller Get Method...!!";
	}
}
