package br.com.css.cnpjsmartsearch.onboarding.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/onboarding")
public class Onboarding {

	@PutMapping(value = "/teste1")
	public ResponseEntity teste1() throws Exception {
		
		return null;
	}
	
	@GetMapping(value = "/teste")
	public ResponseEntity teste() throws Exception {
		
		return null;
	}
}
