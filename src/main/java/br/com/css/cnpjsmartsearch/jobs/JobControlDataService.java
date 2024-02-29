package br.com.css.cnpjsmartsearch.jobs;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.node.ObjectNode;

import br.com.css.cnpjsmartsearch.jobs.model.JobControlModel;

@Service
public class JobControlDataService extends JobService {

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(JobControlDataService.class);

	private final String JOB_SEARCH = "select * from job_control";

	@Autowired
	private Job1Service job1Service;

	@Autowired
	private Job2Service job2Service;


	//@Scheduled(cron = "0,05 * * * * ?")
	public void getJobs(){
		LOG.info("Finding job at {}",  LocalDate.now());
		List<JobControlModel> jobControlList = buildJobControls(getQuery(JOB_SEARCH));
		jobControlList.forEach( job ->{
			try {
				if (!job.getAlive()) {
					LOG.info("Job {} is setted as NOT ALIVE, skiping", job.getName());

				} if (!isTimeToRun(job)) {
					LOG.info("Is not time to run Job {}, skiping", job.getName());
				}
				else {
					switch (job.getName()) {
					case "Job1": {
						job1Service.execute();
						updateLastTimeExecuteJob(job);
						return;
					}
					case "Job2": {
						job2Service.execute();
						updateLastTimeExecuteJob(job);
						return;
					}			
					default:
						throw new IllegalArgumentException("Unexpected value: ");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				LOG.error("Error Trying to execute job {}", job.getName() );
			}
		});

	}

	private void updateLastTimeExecuteJob(JobControlModel job) throws Exception {
		updateLastExecutionTime(new Timestamp(new Date().getTime()), job.getName());
	}

	private boolean isTimeToRun(JobControlModel job) {
		if ((job.getLastExecution() == null) || (new Date().getTime() - job.getLastExecution().getTime()) > job.getPeriodicity()) {
			return true;
		}
		return false;
	}

	private List<JobControlModel> buildJobControls(List<ObjectNode> listObjJobs) {
		List<JobControlModel> list = new ArrayList<JobControlModel>();
		listObjJobs.forEach( listObj -> {
			JobControlModel controlModel = new JobControlModel();
			controlModel.setName(listObj.get("name").asText());
			controlModel.setAlive(listObj.get("alive").asBoolean());
			controlModel.setPeriodicity(listObj.get("periodicity").asLong());
			controlModel.setOnlyWorkDays(listObj.get("only_work_days").asBoolean());
			controlModel.setDescription(listObj.get("description").asText());
			if (!listObj.get("last_execution").isNull()) {
				try {
					controlModel.setLastExecution(new java.sql.Timestamp(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(listObj.get("last_execution").asText()).getTime()));
				} catch (ParseException e) {
					e.printStackTrace();
				} 
			}
			controlModel.setLastStatusExecution(listObj.get("last_status_execution") == null ? null : listObj.get("last_status_execution").asBoolean());
			list.add(controlModel);
			LOG.info("listObj");
		});

		return list;
	}
}
