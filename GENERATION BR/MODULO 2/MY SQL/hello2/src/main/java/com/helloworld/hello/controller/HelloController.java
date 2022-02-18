package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello novamente Tia Gen!!!!"
				+ "\n Essa semana quero desenvolver minha calma mediante desafios, mentalidade de crescimento, "
				+ "orientação a detalhes, comunicação e humildade.";
	}

}
