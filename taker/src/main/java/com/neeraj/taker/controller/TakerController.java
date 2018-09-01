package com.neeraj.taker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TakerController {

	@GetMapping("/get")
	public ResponseEntity<String> get() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForEntity("http://localhost:8081/generate", String.class);
	}
}
