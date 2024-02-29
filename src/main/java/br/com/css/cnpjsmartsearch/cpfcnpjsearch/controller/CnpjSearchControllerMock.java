package br.com.css.cnpjsmartsearch.cpfcnpjsearch.controller;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;

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

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnd.CnpjCpfConsult;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnpjbasic.CnpjConsultBasic;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnpjcompany.CnpjConsultCompany;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnpjqsa.CnpjConsultQsa;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cpf.CpfConsult;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.devedor.Devedor;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.dividaativa.DividaAtiva;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.service.CnpjSearchService;
import br.com.css.cnpjsmartsearch.util.CnpjSearchUtil;


@RestController
@RequestMapping(path = "/cnpj-mock" ,produces= MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class CnpjSearchControllerMock {

	@Autowired
	private CnpjSearchService cnpjSearchService;

	@Autowired
	private CnpjSearchUtil cnpjSearchUtil; 

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(CnpjSearchControllerMock.class);

	@GetMapping("/cnpj-consult-basic")
	public ResponseEntity<CnpjConsultBasic> processConsultBasic(
			@RequestParam(required = true) String cnpj) throws Exception, URISyntaxException {
		return ResponseEntity.ok(cnpjSearchService.consultBasic(cnpj));
	}

	@GetMapping("/cnpj-consult-qsa")
	public ResponseEntity<CnpjConsultQsa> processConsultQsa(
			@RequestParam(required = true) String cnpj) throws Exception, URISyntaxException {
		return ResponseEntity.ok(cnpjSearchService.consultQsa(cnpj));
	}

	@GetMapping("/cnpj-consult-empresa")
	public ResponseEntity<CnpjConsultCompany> processConsultEmpresa(@RequestParam(required = true) String cnpj) throws Exception, URISyntaxException {
		return ResponseEntity.ok(cnpjSearchService.consultCompany(cnpj));
	}

	@GetMapping("/consulta/cnd")
	public ResponseEntity<CnpjCpfConsult> processCnd(@RequestParam(required = true) String idContribuinte) throws Exception, URISyntaxException {
		return ResponseEntity.ok(cnpjSearchService.consultCnd(idContribuinte));
	}

	@GetMapping("/consulta/cpf")
	public ResponseEntity<CpfConsult> processCpf(@RequestParam(required = true) String cpf) throws Exception, URISyntaxException {
		return ResponseEntity.ok(cnpjSearchService.consultCpf(cpf));
	}


	/**
	 * Consulta dados de inscricao
	 * @param inscricao
	 * @return
	 * @throws Exception
	 * @throws URISyntaxException
	 */
	@GetMapping("/consulta/divida-ativa/inscricao/{inscricao}")
	public ResponseEntity<List<DividaAtiva>> processDividaAtiva(@PathVariable String inscricao) throws Exception, URISyntaxException {
		return ResponseEntity.ok(cnpjSearchService.processDividaAtiva(inscricao));
	}
	
	/**
	 * consulta dados de devedor
	 * @param inscricao
	 * @return
	 * @throws Exception
	 * @throws URISyntaxException
	 */
	@GetMapping("/consulta/divida-ativa/devedor/{cpfCnpj}")
	public ResponseEntity<List<Devedor>> processDevedor(@PathVariable String cpfCnpj) throws Exception, URISyntaxException {
		return ResponseEntity.ok(cnpjSearchService.processDevedor(cpfCnpj));
	}


	@GetMapping("/generate-cnpj-consult")
	public ResponseEntity generateCnpjConsult() throws Exception, URISyntaxException {
		URL url = Thread.currentThread().getContextClassLoader().getResource("jsonsgov/smartdata/smartdatacpf.json");
		String rootPath = Paths.get("").toAbsolutePath().toString();
		File file = new File(rootPath.concat("/src/main/java/com/br/css/cnpjsmartsearch/cnpjsearch/model"));

		cnpjSearchUtil.genJsonClasses(url, file, "smartdatacpf", "smartdatacpf");
		return ResponseEntity.ok(null);
	}

}
