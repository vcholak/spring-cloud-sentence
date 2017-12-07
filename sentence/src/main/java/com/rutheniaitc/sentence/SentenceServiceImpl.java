package com.rutheniaitc.sentence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rutheniaitc.sentence.dao.AdjectiveClient;
import com.rutheniaitc.sentence.dao.ArticleClient;
import com.rutheniaitc.sentence.dao.NounClient;
import com.rutheniaitc.sentence.dao.SubjectClient;
import com.rutheniaitc.sentence.dao.VerbClient;

@Service
public class SentenceServiceImpl implements SentenceService {
	
	AdjectiveClient adjectiveClient;
	ArticleClient articleClient;
	NounClient nounClient; 
	SubjectClient subjectClient;
	VerbClient verbClient;

	@Override
	public String buildSentence() {
		String sentence = subjectClient.getWord() + " "
				+ verbClient.getWord() + " "
				+ articleClient.getWord() + " "
				+ adjectiveClient.getWord() + " "
				+ nounClient.getWord() + ".";
		
		return sentence;
	}

	@Autowired
	public void setAdjectiveClient(AdjectiveClient adjectiveClient) {
		this.adjectiveClient = adjectiveClient;
	}

	@Autowired
	public void setArticleClient(ArticleClient articleClient) {
		this.articleClient = articleClient;
	}

	@Autowired
	public void setNounClient(NounClient nounClient) {
		this.nounClient = nounClient;
	}

	@Autowired
	public void setSubjectClient(SubjectClient subjectClient) {
		this.subjectClient = subjectClient;
	}

	@Autowired
	public void setVerbClient(VerbClient verbClient) {
		this.verbClient = verbClient;
	}

}
