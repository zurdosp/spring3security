package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.ibge.localidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Uf {
	private Long id;
	private String sigla;
	private String nome;
	private Regiao regiao;

	public Uf() {
	}
	
	public Uf(Long id, String sigla, String nome, Regiao regiao) {
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
		this.regiao = regiao;
	}
}
