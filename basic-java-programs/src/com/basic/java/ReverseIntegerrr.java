
package com.basic.java;

public class ReverseIntegerrr {

//	public static void main(String[] args) {
//		String name = "Tejaswi";
//		String rev = new StringBuffer(name).reverse().toString();
//		System.out.println("The reverse string is : " +rev);
//	}
	
//	public static void main(String[] args) {
//		String name  = "Harish";
//		char[] reverse = name.toCharArray();
//		for(int i = reverse.length-1;i>=0;i--) {
//			System.out.println("The reverse strign is :"+reverse[i]) ;
//			
//		}
//	}
	
	public static void main(String[] args) {
		int i = 1234, rev = 0;
		
		while(i!=0) {
			int digit = i%10;
			rev= rev*10+digit;
			i/=10;
		}
		System.out.println("The reverse integer is :" + rev);
		}
	}

