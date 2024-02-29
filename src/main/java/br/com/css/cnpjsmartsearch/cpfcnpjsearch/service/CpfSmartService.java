package br.com.css.cnpjsmartsearch.cpfcnpjsearch.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.SmartDataCpf;
import br.com.css.cnpjsmartsearch.global.SuperServices;
import br.com.css.cnpjsmartsearch.onboarding.enums.OnboardingSourceTypeEnum;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;


@Service
public class CpfSmartService extends SuperServices {


	@PersistenceContext
	public EntityManager entityManager;

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(CpfSmartService.class);

	@Transactional
	public SmartDataCpf createSmartCnpj(SmartDataCpf smartdataCnpj, OnboardingSourceTypeEnum onboardingSourceType) throws Exception {
		validateSmartData(smartdataCnpj);
		LOG.info("Creating onboarding {}", smartdataCnpj);
		Query q = entityManager.createNativeQuery(SQL_INSERT_ONBOARDING)
				.setParameter(1, new Gson().toJson(smartdataCnpj))
				.setParameter(2, smartdataCnpj.getCpf())
				.setParameter(3, "CNPJ")
				.setParameter(4, onboardingSourceType.toString())
				.setParameter(5, "");
		int count  = q.executeUpdate();
		LOG.info("Executed, row affected: {}", count);
		return smartdataCnpj;
	}	
	

	private void validateSmartData(SmartDataCpf smartdataCnpj) {
		// TODO Auto-gener method stub
		
	}

	@Transactional
	public SmartDataCpf updateOnboarding(SmartDataCpf smartDataCpf) throws Exception {
		validateSmartData(smartDataCpf);
		LOG.info("Updating onboarding {}", smartDataCpf);
		int count = entityManager.createNativeQuery(SQL_UPDATE_ONBOARDING)
				.setParameter(1, new Gson().toJson(smartDataCpf))
				.setParameter(2, "")
				.setParameter(3, LocalDateTime.now())
				.setParameter(4, smartDataCpf.getCpf())
				.setParameter(5, smartDataCpf.getId())
				.executeUpdate();
		LOG.info("Executed, row affected: {}", count);
		return smartDataCpf;
	}


}
