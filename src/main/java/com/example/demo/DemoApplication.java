package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;


@SpringBootApplication
public class DemoApplication {

	private String url;
	private String username;
	private String password;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Profile("dev")
	@Bean
	public String devConnection() {
		System.out.println("Connection for DEV");
		System.out.println(url);
		return "Connection for DEV";
	}

	@Profile("test")
	@Bean
	public String testConnection() {
		System.out.println("Connection for TEST");
		System.out.println(url);
		return "Connection for TEST";
	}


	@Profile("prod")
	@Bean
	public String prodConnection() {
		System.out.println("Connection for PROD");
		System.out.println(url);
		return "Connection for PROD";
	}
}
