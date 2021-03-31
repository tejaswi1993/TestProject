package com.basic.java;

public class NumberIsPrimeOrNot {

	public static void main(String[] args) {
	int num = 33;
	boolean prime = false;
	
	for(int i =2;i<=num/2;i++) {
		if(num % i == 0) {
			prime = true;
			break;
		}
	}
	
	if(!prime) {
		System.out.println(num + "is prime number");
	}
	else {
		System.out.println(num  + "prime number");
	}
}
}
