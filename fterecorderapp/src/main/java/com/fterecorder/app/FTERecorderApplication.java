package com.fterecorder.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import io.github.kaiso.relmongo.config.EnableRelMongo;

@SpringBootApplication
@EnableRelMongo
@EnableEurekaClient
public class FTERecorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FTERecorderApplication.class, args);
	}

}
