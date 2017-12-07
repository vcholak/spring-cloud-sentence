package com.rutheniaitc.sentence.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SUBJECT-SERVICE") // serviceId
public interface SubjectClient {
	
	@GetMapping("/")
	String getWord();

}
