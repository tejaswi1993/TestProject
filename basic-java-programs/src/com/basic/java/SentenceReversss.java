package com.basic.java;

public class SentenceReversss {

	public static void main(String[] args) {
		
		String s = "Beautiful beach in goa";
		String[] arrayS = s.split(" ");
		
		System.out.println(arrayS.length);
		
		for(int i =arrayS.length-1;i>=0;i--) {
			System.out.println(arrayS[i] + " \t");
		}
		
	}
	
}
