package br.com.css.cnpjsmartsearch.jobs;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.css.cnpjsmartsearch.global.SuperServices;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
@Transactional
public class JobService extends SuperServices {


	@PersistenceContext
	public EntityManager entityManager;
	
	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Job1Service.class);
	
	@Transactional
	public void updateLastExecutionTime(Timestamp lastExecutionTime, String jobName) throws Exception {
		LOG.info("Updating execution time... ");
		Query q = entityManager.createNativeQuery("UPDATE job_control SET last_execution = ? WHERE name = ?")
				.setParameter(1, lastExecutionTime)
				.setParameter(2, jobName);
		int count  = q.executeUpdate();
		LOG.info("Executed, row affected: {}", count);
	}
}
