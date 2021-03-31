package com.basic.java;

import java.util.Arrays;

public class Anagramm {

	public static void main(String[] args) {
		
		int i =1;
		while (i<=10)
		{
			System.out.println(i);
			i=11;
			if(i < 7)
			{
			System.out.println("Hello" +i);
			}

		}
		
		do
		{
			System.out.println(i);
			
			if(i < 7)
			{
			System.out.println("Hello" +i);
			}

			i++;
		}
		while (i<=9);
		
	/*String s1 = "listen";
	String s2 = "sdrekn";
	boolean isAnagram = true;

	char[] char1 = s1.toCharArray();
	char[] char2 = s2.toCharArray();


	int l1 = char1.length;
	
	int l2 = char2.length;

	if(l1!=l2){
		System.out.println("Not anagram");
	}
	else{
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		for(int i = 0;i<=l1-1;i++){
			if(char1[i]!=char2[i]){
				System.out.println("not anagram");
				isAnagram = false;
				break;
			}
			
		}
		}
		if(isAnagram){
		System.out.println("Both Strings are anagram");
		}
}*/
	}
}
