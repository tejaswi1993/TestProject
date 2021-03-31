package com.basic.java;

import java.util.Arrays;

public class DistinctArray {

	public static void main(String[] args) {
		int arr[]={1,2,2,2,2,2,2,3,5,6,6,6,6,7,8,9,9};
		
		
		int l1= arr.length;

		int[] data = new int[l1];
		int counter=0;


		for(int i =0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				data[counter]=arr[i];
				counter++;
			}
			}
			data[counter] = arr[l1-1];
			int[] data1 = new int[counter+1];
			for(int i=0;i<=counter;i++) {
				data1[i]=data[i];
				System.out.println(data1[i]);
				

				
			}
	}
}
