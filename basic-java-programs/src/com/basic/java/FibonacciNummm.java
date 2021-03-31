package com.basic.java;

public class FibonacciNummm {

	static int fib(int num) {
		int first = 0;
		int second = 1, temp;
		if(num==0)
			return first;
		if(num==1)
			return second;
		for(int i =1; i<=num;i++) {
			temp = first+second;
			first=second;
			second=temp;
		}
		return second;
		}
	
	public static void main(String[] args) {
		int num = 10;
		System.out.println("The fibonacci for given number is " + fib(num));
	}
}
