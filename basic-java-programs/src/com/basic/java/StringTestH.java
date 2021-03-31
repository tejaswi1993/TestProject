package com.basic.java;

public class StringTestH {

	public static void main(String[] args) {

		String a = "wonderfuvl";

		int n = (a.length()-2) / 2;

		int k = 0;

		if (n == 0) {
			k = n;
		} else {
			k = n + 1;
		}

		char[] charArray = a.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i=1,j = a.length()-2; i <= k; i++,j--) 
		{
			sb.append(charArray[i]);
			if(j>k)
			sb.append(charArray[j]);
			
		}
		System.out.println(sb.toString());
		
	}
}
