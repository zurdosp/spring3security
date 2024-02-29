package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.ibge.localidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Regiao {
	private Long id;
	private String sigla;
	private String nome;

	public Regiao() {
	}
	
	public Regiao(Long id, String sigla, String nome) {
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
	}

}