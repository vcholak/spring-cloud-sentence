package com.rutheniaitc.sentence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {
	
	@Autowired WordService wordService;

	@Override
	public String buildSentence() {
		String sentence = wordService.getSubject() + " "
				+ wordService.getVerb() + " "
				+ wordService.getArticle() + " "
				+ wordService.getAdjective() + " "
				+ wordService.getNoun() + ".";
		
		return sentence;
	}
	
}
