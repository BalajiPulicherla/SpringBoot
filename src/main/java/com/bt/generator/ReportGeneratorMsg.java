package com.bt.generator;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGeneratorMsg {
	@Scheduled(initialDelay = 2000,fixedDelay = 5000)
	public void generateReport() {
		System.out.println("Hello::"+new Date());
	}

}
