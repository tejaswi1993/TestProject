package com.basic.java;

public class PrimeNumber {

	public static void main(String[] args) {
		int temp;
		boolean isPrime = true;
		int num = 8;
		for(int i=2;i<=num/2;i++) {
			temp = num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println("THe number is prime");
		else
			System.out.println("The number is not prime");
	}
}
