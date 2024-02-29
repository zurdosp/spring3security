package br.com.css.cnpjsmartsearch.cpfcnpjsearch.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.nf.CnpjResultNf;

@Service
public class NfService {
	
	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(NfService.class);

	String URL_ROOT = "https://gateway.apiserpro.serpro.gov.br/consulta-nfe-df-trial/api/v1/";
	String URL_BASIC = "nfe/";
	
	public CnpjResultNf consultNf(String nfKey) {
		LOG.info("Consulting nfkey: {}", nfKey);
		CnpjResultNf cnpjresultnf = null;
		Gson gson = new Gson();
		try (Reader reader = new FileReader(Thread.currentThread().getContextClassLoader().getResource("jsonsgov/cnpjresult-nf.json").getFile())) {
			cnpjresultnf = gson.fromJson(reader, CnpjResultNf.class);
		} catch (IOException e) {
			LOG.error("Trying to consult cnpj.", e);
		}
		return cnpjresultnf;
	}

}
