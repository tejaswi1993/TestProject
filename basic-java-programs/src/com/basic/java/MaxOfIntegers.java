package com.basic.java;

public class MaxOfIntegers {

	public static void main(String[] args) {
		int[] num = {384,549,958,578};

		int min =10, max=-1;

		int size = num.length;

		for(int i=0;i<size;i++){
		if(num[i]==0){
		}
		else{
		while(num[i]!=0){

		int n=num[i]%10;
		if(n<min){
			min=n;
		}
		if(n>max) {
			max=n;
		}
		num[i]=num[i]/10;

		}
		
		}
		}
		System.out.println("min value is " +min);
		System.out.println("max value is :"+max);
	}
}


	

