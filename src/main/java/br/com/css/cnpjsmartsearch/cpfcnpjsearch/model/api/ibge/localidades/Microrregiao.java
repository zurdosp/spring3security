package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.ibge.localidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Microrregiao {
	private Long id;
	private String nome;
	private Mesorregiao mesorregiao;

	public Microrregiao() {
	}
	
	public Microrregiao(Long id, String nome, Mesorregiao mesorregiao) {
		this.id = id;
		this.nome = nome;
		this.mesorregiao = mesorregiao;
	}
}
