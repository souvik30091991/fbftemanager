package com.fteretrieve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fteretrieve.cotroller")
public class FteretrieveappApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FteretrieveappApplication.class, args);
	}

}
