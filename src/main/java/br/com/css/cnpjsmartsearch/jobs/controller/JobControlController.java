package br.com.css.cnpjsmartsearch.jobs.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.css.cnpjsmartsearch.jobs.JobControlDataService;

@RestController
@RequestMapping(path = "/jobs" ,produces= MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class JobControlController {

	@Autowired
	private JobControlDataService controlDataService;
	
	@GetMapping()
	public ResponseEntity<?> jobControl() {
		controlDataService.getJobs();
		return ResponseEntity.ok(null);
	}
	
}
