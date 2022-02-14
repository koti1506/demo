package com.example.demo.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/msg")
	public String getMsg(@RequestParam Optional<String> name) {
		return " User Name :"+name.orElseGet(()->"Name is not Provided");
		
	}

}
