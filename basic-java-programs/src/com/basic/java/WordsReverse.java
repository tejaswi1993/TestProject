package com.basic.java;

public class WordsReverse {

	public static void main(String[] args) {
		String sentence = "How are you";
		String reversed = reverse(sentence);
		System.out.println("The reverse sentence is :"+reversed);
		
	}

	private static String reverse(String sentence) {
		if(sentence.isEmpty())
			return sentence;
		else
			return reverse(sentence.substring(1))+sentence.charAt(0);
	}
}
