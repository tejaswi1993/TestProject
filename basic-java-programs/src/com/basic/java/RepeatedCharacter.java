package com.basic.java;

public class RepeatedCharacter {
	
	public static void main(String[] args) {

	String word = "education";
	
	char[] arrChar = word.toCharArray();
	
	for(int i=0;i<word.length();i++) {
		for(int j=i+1;j<word.length();j++) {
			if(arrChar[j]!=arrChar[i]) {
				System.out.println("The non-duplicate chars are :" + arrChar[j]);
				break;
			}
		}
	}
		
	
	}
}
