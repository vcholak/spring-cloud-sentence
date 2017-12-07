package com.rutheniaitc.sentence.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("NOUN-SERVICE") // serviceId
public interface NounClient {
	
	@GetMapping("/")
	String getWord();

}
