package com.basic.java;

public class FibonacciNumber {

	static int fib(int num) {
		int first = 0;
		int second = 1,temp;
		if(num==0)
			return first;
		if(num==1)
			return second;
		for(int i =2;i<=num;i++) {
			temp=first+second;
			first=second;
			second=temp;
		}
		return second;
	}
	
	public static void main(String[] args) {
		int num = 9;
		System.out.println("The nth fibonacci number is :"+fib(num));
	}
}

