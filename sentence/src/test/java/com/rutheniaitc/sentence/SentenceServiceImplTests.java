package com.rutheniaitc.sentence;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import org.junit.Assert;

public class SentenceServiceImplTests {
	
	// Class under test:
	SentenceServiceImpl service;	

	@Before
	public void setup() {
		
		// Class under test:
		service = new SentenceServiceImpl();
						
		// Establish Mock dependencies:		 		
		WordService wordService = Mockito.mock(WordService.class);
		
		service.setWordService(wordService);
		
		// Describe Mock behaviors:
		Mockito.when(wordService.getSubject()).thenReturn("He");
		Mockito.when(wordService.getVerb()).thenReturn("saw");
		Mockito.when(wordService.getArticle()).thenReturn("a");
		Mockito.when(wordService.getAdjective()).thenReturn("dark");
		Mockito.when(wordService.getNoun()).thenReturn("dog");		
	}
	
	@Test
	public void testCorrectOrder() {
		// We should get the sentence built in the correct order:
		Assert.assertEquals("He saw a dark dog.", service.buildSentence());
	}
}
