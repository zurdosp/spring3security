package br.com.css.cnpjsmartsearch.jobs;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class Job1Service implements IJobService {

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Job1Service.class);
	
	@Override
	public void execute() {
		LOG.info("executing {} job at {}", this.getName(), LocalDateTime.now());		
	}

	
	public String getName() {
		return "Job1";
	}
	
}
