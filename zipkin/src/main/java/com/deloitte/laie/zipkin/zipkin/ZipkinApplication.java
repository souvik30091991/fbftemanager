package com.deloitte.laie.zipkin.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;

import zipkin.server.EnableZipkinServer;;

@SpringBootApplication(exclude = { HttpEncodingAutoConfiguration.class })
@EnableZipkinServer
public class ZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}

}
