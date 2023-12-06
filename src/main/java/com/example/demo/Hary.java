package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/A")

public class Hary {
@GetMapping(path="/B")
public String Check() {
	return "HAI HARY";
}
}
