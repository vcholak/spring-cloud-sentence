package com.rutheniaitc.noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NounApplication {

	public static void main(String[] args) {
		SpringApplication.run(NounApplication.class, args);
	}
}
