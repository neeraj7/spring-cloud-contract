package com.neeraj.generator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratorController {

	@GetMapping("/generate")
	public ResponseEntity<String> hello() {
		return ResponseEntity.status(201).body("Hello!");
	}
}
