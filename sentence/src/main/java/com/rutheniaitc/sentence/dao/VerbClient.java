package com.rutheniaitc.sentence.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("VERB-SERVICE") // serviceId
public interface VerbClient {
	
	@GetMapping("/")
	String getWord();

}
