package br.com.css.cnpjsmartsearch.cpfcnpjsearch.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnd.CnpjCpfConsult;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnpjbasic.CnpjConsultBasic;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnpjcompany.CnpjConsultCompany;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnpjqsa.CnpjConsultQsa;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cpf.CpfConsult;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.devedor.Devedor;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.dividaativa.DividaAtiva;

@Service
public class CnpjSearchService {
	
	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(CnpjSearchService.class);

	String URL_ROOT = "https://gateway.apiserpro.serpro.gov.br/consulta-cnpj-df-trial/v2/";
	String URL_BASIC = "basica/";
	String URL_QSA = "qsa/";
	String URL_COMPANY = "empresa/";
	
	public CnpjConsultQsa consultQsa(String cnpj) {
		CnpjConsultQsa cnpjConsultQsa = null;
		Gson gson = new Gson();
		try (Reader reader = new FileReader(Thread.currentThread().getContextClassLoader().getResource("jsonsgov/cnpjresult-qsa.json").getFile())) {
			cnpjConsultQsa = gson.fromJson(reader, CnpjConsultQsa.class);
		} catch (IOException e) {
			LOG.error("Trying to consult cnpj.", e);
		}
		return cnpjConsultQsa;
	}


	public CnpjConsultBasic consultBasic(String cnpj) {
		CnpjConsultBasic cnpjConsult = null;
		Gson gson = new Gson();
		try (Reader reader = new FileReader(Thread.currentThread().getContextClassLoader().getResource("jsonsgov/cnpjresult-basic.json").getFile())) {
			cnpjConsult = gson.fromJson(reader, CnpjConsultBasic.class);
		} catch (IOException e) {
			LOG.error("Trying to consult cnpj.", e);
		}
		return cnpjConsult;
	}
	
	public CnpjConsultCompany consultCompany(String cnpj) { 
		CnpjConsultCompany cnpjConsultCompany = null; 
		Gson gson = new Gson(); 
		try {
			Reader reader = new FileReader(Thread.currentThread().getContextClassLoader().getResource(
				"jsonsgov/cnpjresult-company.json").getFile()); 
			cnpjConsultCompany = gson.fromJson(reader, CnpjConsultCompany.class);
		} catch (IOException e) {
			LOG.error("Trying to consult cnpj.", e); 
		} 
		return cnpjConsultCompany; 
	}
	
	public CpfConsult consultCpf(String cpf) {
		CpfConsult cpfConsult = null; 
		Gson gson = new Gson(); 
		try {
			Reader reader = new FileReader(Thread.currentThread().getContextClassLoader().getResource(
				"jsonsgov/cnpjresult-cpf.json").getFile()); 
			cpfConsult = gson.fromJson(reader, CpfConsult.class);
		} catch (IOException e) {
			LOG.error("Trying to consult cnpj.", e); 
		} 
		return cpfConsult; 
	}
	
	public CnpjCpfConsult consultCnd(String idContribuinte) {
		CnpjCpfConsult cnpjCpfConsult = null; 
		Gson gson = new Gson(); 
		try {
			Reader reader = new FileReader(Thread.currentThread().getContextClassLoader().getResource(
				"jsonsgov/cnpjresult-cnd-certidao.json").getFile()); 
			cnpjCpfConsult = gson.fromJson(reader, CnpjCpfConsult.class);
		} catch (IOException e) {
			LOG.error("Trying to consult cnd.", e); 
		} 
		return cnpjCpfConsult; 
	}

	// https://gateway.apiserpro.serpro.gov.br/consulta-divida-ativa-df-trial/api/v1/inscricao/9061700096419
	public List<DividaAtiva> processDividaAtiva(String inscricao) {
		DividaAtiva[] dividaAtivaList = null; 
		Gson gson = new Gson(); 
		try {
			Reader reader = new FileReader(Thread.currentThread().getContextClassLoader().getResource(
				"jsonsgov/cnpjresult-dividaativa.json").getFile()); 
			dividaAtivaList = gson.fromJson(reader, DividaAtiva[].class);
		} catch (IOException e) {
			LOG.error("Trying to consult divida ativa.", e); 
		} 
		return Arrays.asList(dividaAtivaList); 
	}

	// https://gateway.apiserpro.serpro.gov.br/consulta-divida-ativa-df-trial/api/v1/devedor/01415666000181
	public List<Devedor> processDevedor(String cpfCnpj) {
		Devedor[] devedorList = null; 
		Gson gson = new Gson(); 
		try {
			Reader reader = new FileReader(Thread.currentThread().getContextClassLoader().getResource(
				"jsonsgov/cnpjresult-devedor.json").getFile()); 
			devedorList = gson.fromJson(reader, Devedor[].class);
		} catch (IOException e) {
			LOG.error("Trying to consult devedor.", e); 
		} 
		return Arrays.asList(devedorList); 
	}
}
