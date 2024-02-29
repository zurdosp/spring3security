package br.com.css.cnpjsmartsearch.cpfcnpjsearch.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.service.CnpjPublicDataService;

@RestController
@RequestMapping(path = "/cnpj-public" ,produces= MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class CnpjPublicDataController {
	
	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(CnpjPublicDataController.class);
	
	@Autowired
	private CnpjPublicDataService cnpjPublicDataService;
	
	
	@GetMapping(path="/ec")
	public ResponseEntity<Object> findCnpjEc(@RequestParam(required = false) String cnpj,
											 @RequestParam(required = false) String uf,
											 @RequestParam(required = false) String munic,
											 @RequestParam(required = false) String cnaeCodes,
										     @RequestParam(required = false, defaultValue = "ASC") String sortDirection,
										     @RequestParam(required = false, defaultValue = "estabelecimento")  String sortField,
										     @RequestParam(required = false, defaultValue = "0")   int page,
										     @RequestParam(required = false, defaultValue = "20")  int size) {
		LOG.info("Consulting Estabelecimento cnpj: {}, uf: {}, munic: {}, cnaeCode: {}", cnpj, (uf == null)? null:uf.toUpperCase(), munic, cnaeCodes);

		return ResponseEntity.ok(cnpjPublicDataService.getPublicDataCnpjEmpresaParamsquery(cnpj, munic, (uf == null)? null:uf.toUpperCase(), cnaeCodes, sortDirection, sortField, page, size)); 
	}
	
	@GetMapping(path="/partners/{cnpj}")
	public ResponseEntity<Object> findCnpjPartners(@PathVariable(name="cnpj") String cnpj,
										   @RequestParam(required = false, defaultValue = "ASC") String sortDirection,
										   @RequestParam(required = false, defaultValue = "estabelecimento")  String sortField,
										   @RequestParam(required = false, defaultValue = "0")   int page,
										   @RequestParam(required = false, defaultValue = "20")  int size) {
		LOG.info("Consulting Partners cnpj:" + cnpj);	
		return ResponseEntity.ok(cnpjPublicDataService.getPublicDataCnpjSocios(cnpj, sortDirection, sortField, page, size));
	}
	
	@GetMapping(path="/simples/{cnpj}")
	public ResponseEntity<Object> findCnpjSimples(@PathVariable(name="cnpj") String cnpj,
										   @RequestParam(required = false, defaultValue = "ASC") String sortDirection,
										   @RequestParam(required = false, defaultValue = "estabelecimento")  String sortField,
										   @RequestParam(required = false, defaultValue = "0")   int page,
										   @RequestParam(required = false, defaultValue = "20")  int size) {
		LOG.info("Consulting Simples cnpj:" + cnpj);	
		return ResponseEntity.ok(cnpjPublicDataService.getPublicDataCnpjSimples(cnpj, sortDirection, sortField, page, size));
	}
	
}
