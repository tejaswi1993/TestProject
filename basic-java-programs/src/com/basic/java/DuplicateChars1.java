package com.basic.java;

public class DuplicateChars1 {

//	public static void main(String[] args) {
//		String str = "Enexus Global";
//		char[] chars = str.toCharArray();
//		for(int i=0;i<str.length();i++) {
//			for(int j=i+1;j<str.length();j++) {
//				if(chars[j]==(chars[i])) {
//					System.out.println("The duplicate chars are :" + chars[j]);
//					break;
//				}
//			}
//		}
//		
//	}
	
	
	public static void main(String[] args) {
		String[] input = {"jsk","ijdj","jsk","ijdj","jsk"};
		for(int i = 0;i<input.length;i++) {
			for(int j = i+1;j<input.length;j++) {
				if(input[j].equals(input[i])){
					System.out.println("THe duplicate elements are :" + input[j]);
					break;
				}
			}
		}
		
		
	}
}
