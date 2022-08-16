package com.example.schedulingtasks.schedular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.schedulingtasks.service.RestClient;



@Component
public class ScheduledTask {

	@Autowired
	RestClient restClient;
	
	@Scheduled(initialDelayString ="0",fixedDelayString="180000")
	public void apiScheduledTask() {
		restClient.saveUserDetails();
		
	}
}
