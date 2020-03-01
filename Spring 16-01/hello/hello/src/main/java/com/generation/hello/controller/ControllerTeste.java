package com.generation.hello.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTeste {
	@GetMapping ("/hello")
	public String sayHello () {
		return "Hello World! Nosso primeiro projeto Spring Boot";
	}

}
