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

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.SmartDataCpf;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.service.CpfSmartService;
import br.com.css.cnpjsmartsearch.onboarding.enums.OnboardingSourceTypeEnum;
import br.com.css.cnpjsmartsearch.onboarding.enums.OnboardingTypeEnum;


@RestController
@RequestMapping(path = "/cpf_smart" ,produces= MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")

public class CpfSmartController {

	@Autowired
	private CpfSmartService cpfSmartService;

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(CnpjSearchControllerMock.class);


	@PostMapping()
	public ResponseEntity<SmartDataCpf> createSmartCnpj(@RequestBody SmartDataCpf smartDataCpf, @RequestParam OnboardingSourceTypeEnum onboardingSourceType) throws Exception {
		LOG.info("Creating onboarding: {} with onboardingSourceType: {}", smartDataCpf, onboardingSourceType.toString());
		return ResponseEntity.ok( cpfSmartService.createSmartCnpj(smartDataCpf, onboardingSourceType));
	}
	
	@PutMapping
	public ResponseEntity<SmartDataCpf> updateOnBordingcompany(@RequestBody SmartDataCpf smartDataCpf) throws Exception {
		LOG.info("update onboarding: {}", smartDataCpf);
		return ResponseEntity.ok( cpfSmartService.updateOnboarding(smartDataCpf) );
	}

	@GetMapping("/filter")
	public ResponseEntity<Object> getOnboardingByCpfCnpj(@RequestParam UUID id, @RequestParam OnboardingTypeEnum type) throws Exception {
		return ResponseEntity.ok( cpfSmartService.filter(id, type));
	}
}
