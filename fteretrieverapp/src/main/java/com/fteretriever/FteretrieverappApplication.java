package com.fteretriever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fteretriever.controller")
public class FteretrieverappApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FteretrieverappApplication.class, args);
	}

}
