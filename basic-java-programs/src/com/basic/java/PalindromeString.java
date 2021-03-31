package com.basic.java;

import java.util.Scanner;

public class PalindromeString {

//	public static void main(String[] args) {
//		
//		String str, rev = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string");
//		str = sc.nextLine();
//		int length = str.length();
//		System.out.println("The lemgth is : "+length);
//		
//		for(int i = length-1;i>=0; i--) 
//			rev = rev+str.charAt(i);
//			
//			if(str.equals(rev)) 
//				System.out.println(str +" is a palindrome");
//				else
//					System.out.println(str + "is not palimdrome");
//			
//	}

	public static void main(String[] args) {
//		String input = "mom";
//		String reverse = new StringBuffer(input).reverse().toString();
//		if (input.equals(reverse))
//			System.out.println("The give string is palindrome");
//		else
//			System.out.println("Not palindrome");

		int j = 0;
		String s1 = "harish";
		char[] chars = s1.toCharArray();
		boolean isPalindrome = true;
		int size = chars.length;
		for (int i = size - 1; i >= 0; i--) {
			
			if (i == j || i < j)
				break;
			
			if (chars[i] != chars[j++])
			{

				isPalindrome = false;
				break;

			}
			

		}
		if (isPalindrome) {
			System.out.println("Is Palindrome");
		}
		else {
			System.out.println("not Palindrome");

		
		}

	}
}
