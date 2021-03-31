package com.basic.java;

public class ReverseString {

//	public static void main(String[] args) {
//		String input = "Tejaswi";
//		
//		//convert string to bytes using getBytes[]
//		
//		byte[] input1 = input.getBytes();
//		byte[] length = new byte[input1.length];
//		
//		for(int i = 0; i<input1.length; i++) {
//			length[i] = input1[input1.length-i-1];
//			
//			System.out.println(new String(length));
//		}
//	}
	
	
//	public static void main(String[] args) {
//		
//		String input = "Tejaswi";
//		
//		StringBuffer input2 = new StringBuffer(input);
//		
//		input2.reverse();
//		
//		System.out.println("The result is :" +input2);
//	}
	
//	public static void main(String[] args) {
//		String name = "Tejaswi";
//		String reverse = new StringBuffer(name).reverse().toString();
//		System.out.println("The reversed string is "+reverse);
//	}
	
	public static void main(String[] args) {
		String name = "I love you";
		char[] reverse = name.toCharArray();
		for(int i = reverse.length-1;i>=0;i--) {
			System.out.println(reverse[i]);
			
		}
	}
}
