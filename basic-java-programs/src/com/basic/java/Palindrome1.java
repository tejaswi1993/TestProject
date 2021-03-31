package com.basic.java;

public class Palindrome1 {

	public static void main(String[] args) {
		String name = "dad";
		String reverse = new StringBuffer(name).reverse().toString();
		if(reverse.equals(name)) {
			System.out.println("THe string is palindrome");
		}
		else {
			System.out.println("The String is not palindrome");
		}
	}
	
	

	
	
}
