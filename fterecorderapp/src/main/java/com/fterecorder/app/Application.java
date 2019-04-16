package com.fterecorder.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.kaiso.relmongo.config.EnableRelMongo;

@SpringBootApplication
@EnableRelMongo
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
