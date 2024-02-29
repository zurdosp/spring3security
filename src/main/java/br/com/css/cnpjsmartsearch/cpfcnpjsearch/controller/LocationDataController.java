package br.com.css.cnpjsmartsearch.cpfcnpjsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.ibge.localidades.IbgeLocalidade;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.ibge.localidades.Uf;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.service.LocationDataService;

@RestController
@RequestMapping(path = "/locationData" ,produces= MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class LocationDataController {

	@Autowired
	private LocationDataService locationDataService;

	@GetMapping("/estados")
	public ResponseEntity<List<Uf>> getEstados() {
		return ResponseEntity.ok(locationDataService.getEstados());
	}

	@GetMapping("uf/{uf}/municipios")
	public ResponseEntity<List<IbgeLocalidade>> getMunicipios(@PathVariable(name="uf") String uf) {
		return ResponseEntity.ok(locationDataService.getMunicipios(uf));
	}
	
}
