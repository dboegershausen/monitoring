package com.recommender.monitoring;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class BikesRecommenderMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikesRecommenderMonitoringApplication.class, args);
	}

}
