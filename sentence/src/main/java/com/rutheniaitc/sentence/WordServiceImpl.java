package com.rutheniaitc.sentence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import com.rutheniaitc.sentence.dao.AdjectiveClient;
import com.rutheniaitc.sentence.dao.ArticleClient;
import com.rutheniaitc.sentence.dao.NounClient;
import com.rutheniaitc.sentence.dao.SubjectClient;
import com.rutheniaitc.sentence.dao.VerbClient;

@Service
public class WordServiceImpl implements WordService {
	
	@Autowired AdjectiveClient adjectiveClient;
	@Autowired ArticleClient articleClient;
	@Autowired NounClient nounClient; 
	@Autowired SubjectClient subjectClient;
	@Autowired VerbClient verbClient;

	@Override
	@HystrixCommand(fallbackMethod="getFallbackSubject")
	public String getSubject() {		
		return subjectClient.getWord();
	}

	@Override
	public String getVerb() {		
		return verbClient.getWord();
	}

	@Override
	public String getArticle() {		
		return articleClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public String getAdjective() {		
		return adjectiveClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod="getFallbackNoun")
	public String getNoun() {		
		return nounClient.getWord();
	}

	public String getFallbackSubject() {
		return "Someone";
	}
	
	public String getFallbackAdjective() {
		return "";
	}
	
	public String getFallbackNoun() {
		return "something";
	}
}
