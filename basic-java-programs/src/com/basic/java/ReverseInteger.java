package com.basic.java;

public class ReverseInteger {
	
	public static void main(String[] args) {
		int i = 4523 , rev = 0; int counter=0;
		String s = Integer.toString(i);
		
		int[] arr = new int[s.length()];
		
		while(i!=0) {
			int digit = i%10;
				arr[counter]=digit;
				counter++;
				rev = rev*10+digit;
				i/=10;
				
		}	
		for(int j=0;j<arr.length;j++) {
			System.out.println("String is :" +arr[j]);
			
		}
		//System.out.println("THe reverse int is : "+rev);
	}

}
