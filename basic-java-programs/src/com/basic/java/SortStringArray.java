package com.basic.java;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		String[] myArr = {"Java","Hadoop","python","HBase"};
		int size = myArr.length;
		
		for(int i=0;i<size-1;i++) {
			for(int j= i+1;j<size;j++) {
				if(myArr[i].compareTo(myArr[j])>0) {
					String temp = myArr[i];
				myArr[i]=myArr[j];
				myArr[j]=temp;
			}
		}
	}
		System.out.println(Arrays.toString(myArr));
}
}
