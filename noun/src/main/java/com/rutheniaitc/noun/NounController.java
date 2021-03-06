package com.rutheniaitc.noun;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="noun")
public class NounController {
		
	private String words;
		
	public void setWords(String words) {
		this.words = words;
	}

	@GetMapping("/")
	public @ResponseBody Word getWord() {
	  String[] wordArray = words.split(",");
	  int i = (int)Math.round(Math.random() * (wordArray.length - 1));
	  return new Word(wordArray[i]);
	}

}
