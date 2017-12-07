package com.rutheniaitc.sentence.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ARTICLE-SERVICE") // serviceId
public interface ArticleClient {
	
	@GetMapping("/")
	String getWord();
}
