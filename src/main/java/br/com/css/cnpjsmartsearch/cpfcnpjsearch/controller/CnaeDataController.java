package br.com.css.cnpjsmartsearch.cpfcnpjsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.service.CnpjPublicDataService;

@RestController
@RequestMapping(path = "/cnaeData" ,produces= MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class CnaeDataController {

	@Autowired
	private CnpjPublicDataService cnpjPublicDataService; 
	
	@GetMapping()
	public ResponseEntity<Object> getCnaes() {
		return ResponseEntity.ok(cnpjPublicDataService.getCnaeList());
	}

	
}
