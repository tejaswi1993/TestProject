package com.basic.java;

public class PracticeMphasisCOdeInteger {

	
	public static int printMax() {
		
		int num = -3456;
		int digit = 5;
		
		String s = Integer.toString(num);
		StringBuilder s1  = new StringBuilder();
		
		if(s.charAt(0) != '-') {
			System.out.println("The number is positive");
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)-'0' < digit) {
					s1.append(s.substring(0, i));
					s1.append(Integer.toString(digit));
					s1.append(s.substring(i));
					break;
				}
			}
			if(s1.length() == 0) {
				System.out.println("Empty");
				s1.append(s);
				s1.append(digit);
			}
		}
		else {
			System.out.println("The given num is negative");
			for(int i=0;i<s.length();i++) {
				if(s.charAt(0)- '0' > digit) {
					s1.append(s.substring(0,i));
					s1.append(Integer.toString(digit));
					s1.append(s.substring(i));
					break;
				}
			}
			if(s1.length() == 0) {
				s1.append(s);
				s1.append(digit);
			}
		}
		
		int result = Integer.parseInt(s1.toString());
		return result;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("The result is : " + printMax());
	}
}
