package com.rutheniaitc.subject;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="subject")
public class SubjectController {
		
	private String words;
		
	public void setWords(String words) {
		this.words = words;
	}

	@GetMapping("/")
	public @ResponseBody String getWord() {
	  String[] wordArray = words.split(",");
	  int i = (int)Math.round(Math.random() * (wordArray.length - 1));
	  return wordArray[i];
	}

}
