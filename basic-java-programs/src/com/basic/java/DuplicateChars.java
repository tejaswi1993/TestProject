package com.basic.java;

public class DuplicateChars {

	public static void main(String[] args) {
		
		String str = "beautiful beach";
		char[] chars = str.toCharArray();
		for(int i = 0;i <str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(chars[i]==chars[j]) {
					System.out.println(chars[j]);
					break;
				}
			}
		}
	}
}
