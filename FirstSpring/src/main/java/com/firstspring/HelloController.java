package com.firstspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //It combines two annotations  --> Controller and Response Body
public class HelloController {
	
	@GetMapping("/hello/{name}")
	public HelloResponse hello(@PathVariable String name) {
		return new HelloResponse("Hello "+ name+ "!");
	}
	
	@PostMapping("/hello")
	public HelloResponse hellopost(@RequestBody String name) {
		return new HelloResponse("Hello " + name + "!");
	}
	
}
