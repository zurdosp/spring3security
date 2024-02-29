package br.com.css.cnpjsmartsearch.cpfcnpjsearch.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.ibge.localidades.IbgeLocalidade;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.ibge.localidades.Uf;

@Service
public class LocationDataService {

	public List<Uf> getEstados(){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Uf[]> responseEntity = 
				restTemplate.getForEntity("https://servicodados.ibge.gov.br/api/v1/localidades/estados", Uf[].class); 
		Uf[] ibgeLocalidadeArray = responseEntity.getBody();
		List<Uf> list = Arrays.stream(ibgeLocalidadeArray).collect(Collectors.toList());
		list.forEach( uf -> {
			uf.setNome(uf.getNome()+ " (" + uf.getSigla()  + ")");
		});
		return list;
	}

	public List<IbgeLocalidade> getMunicipios(String uf) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<IbgeLocalidade[]> responseEntity = 
			    restTemplate.getForEntity("https://servicodados.ibge.gov.br/api/v1/localidades/estados/".concat(uf).concat("/municipios"), IbgeLocalidade[].class); 
		IbgeLocalidade[] ibgeLocalidadeArray = responseEntity.getBody();
		List<IbgeLocalidade> list = Arrays.stream(ibgeLocalidadeArray).collect(Collectors.toList());		
		return list;
	}
	
	
	
	
}
