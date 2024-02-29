package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.ibge.localidades;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mesorregiao {
	private Long id;
	private String nome;
    @JsonProperty("UF")
	private Uf uf;

    public Mesorregiao() {
    }
    
	public Mesorregiao(Long id, String nome, Uf uf) {
		this.id = id;
		this.nome = nome;
		this.uf = uf;
	}

}
