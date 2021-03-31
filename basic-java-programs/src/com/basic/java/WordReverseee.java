package com.basic.java;

public class WordReverseee {

	public static void main(String[] args) {
		String sentence = "Hey! How you doing?";
		String reverse = reverse(sentence);
		System.out.println("THe reverse sentence is :" +reverse);
	}
	
	private static String reverse(String sentence) {
		if(sentence.isEmpty())
			return sentence;
		else {
			return reverse(sentence.substring(1))+sentence.charAt(0);
		}
	}
}
