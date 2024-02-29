package br.com.css.cnpjsmartsearch.jobs.model;



import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobControlModel {
	
	private Long id;
	private String name;
	private Boolean alive;
	private Long periodicity;
	private Boolean onlyWorkDays;
	private String description;
	private Timestamp lastExecution;
	private Boolean lastStatusExecution;
	
}
