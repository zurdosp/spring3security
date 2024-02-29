package br.com.css.cnpjsmartsearch.cpfcnpjsearch.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.smartdatacnpj.SmartdataCnpj;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.service.CnpjSmartService;
import br.com.css.cnpjsmartsearch.onboarding.enums.OnboardingSourceTypeEnum;
import br.com.css.cnpjsmartsearch.onboarding.enums.OnboardingTypeEnum;


@RestController
@RequestMapping(path = "/cnpj_smart" ,produces= MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")

public class CnpjSmartController {

	@Autowired
	private CnpjSmartService cnpjSmartService;

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(CnpjSearchControllerMock.class);


	@PostMapping()
	public ResponseEntity<SmartdataCnpj> createSmartCnpj(@RequestBody SmartdataCnpj smartdatacnpj, @RequestParam OnboardingSourceTypeEnum onboardingSourceType) throws Exception {
		LOG.info("Creating onboarding: {} with onboardingSourceType: {}", smartdatacnpj, onboardingSourceType.toString());
		return ResponseEntity.ok( cnpjSmartService.createSmartCnpj(smartdatacnpj, onboardingSourceType));
	}
	
	@PutMapping
	public ResponseEntity<SmartdataCnpj> updateOnBordingcompany(@RequestBody SmartdataCnpj smartdataCnpj) throws Exception {
		LOG.info("update onboarding: {}", smartdataCnpj);
		return ResponseEntity.ok( cnpjSmartService.updateOnboarding(smartdataCnpj) );
	}

	@GetMapping("/filter")
	public ResponseEntity<Object> getOnboardingByCpfCnpj(@RequestParam UUID id, @RequestParam OnboardingTypeEnum type) throws Exception {
		return ResponseEntity.ok( cnpjSmartService.filter(id, type));
	}
}
