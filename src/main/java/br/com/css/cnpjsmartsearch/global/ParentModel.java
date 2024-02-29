package br.com.css.cnpjsmartsearch.global;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParentModel {
	
	@JsonProperty("id")
	private UUID id;
   
}
