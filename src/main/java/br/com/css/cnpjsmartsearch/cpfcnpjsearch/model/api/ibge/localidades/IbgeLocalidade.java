package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.ibge.localidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IbgeLocalidade {
	private Long id;
	private String nome;
	private Microrregiao microrregiao;

	public IbgeLocalidade() {		
	}
	
	public IbgeLocalidade(Long id, String nome, Microrregiao microrregiao) {
		this.id = id;
		this.nome = nome;
		this.microrregiao = microrregiao;
	}
}

