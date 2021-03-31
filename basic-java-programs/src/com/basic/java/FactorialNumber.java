package com.basic.java;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
//		int n,c,f=1;
//		System.out.println("Enter the number to find the factorial: ");
//		Scanner in = new Scanner(System.in);
//		n=in.nextInt();
//		if(n<0) {
//			System.out.println("The number should be non negative");
//		}
//		else
//		{
//			for(c=1;c<=n;c++) {
//				f=f*c;
//				System.out.println("Factoral for" +n+ "is " +f );
//			}
//		}
	  
			  int fact=1;  
			  int number=5;//It is the number to calculate factorial    
			  for(int i=1;i<=number;i++){    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 }  
			
	
}
