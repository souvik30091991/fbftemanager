package com.deloitte.defectRetriever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DefectRetrieverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefectRetrieverApplication.class, args);
	}

}
