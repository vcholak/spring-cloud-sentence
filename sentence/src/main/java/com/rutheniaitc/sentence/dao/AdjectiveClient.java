package com.rutheniaitc.sentence.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ADJECTIVE-SERVICE") // serviceId
public interface AdjectiveClient {
	
	@GetMapping("/")
	String getWord();

}
