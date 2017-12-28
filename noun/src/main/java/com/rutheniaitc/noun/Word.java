package com.rutheniaitc.noun;

/**
 * 'Word' object is nicely represented in JSON over a regular String.
 * @author vcholak
 *
 */
public class Word {
	
	private String word;
	
	public Word() {
		super();		
	}

	public Word(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}	

}
