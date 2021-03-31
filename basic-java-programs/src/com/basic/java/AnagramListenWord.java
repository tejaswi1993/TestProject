package com.basic.java;

import java.util.Arrays;

public class AnagramListenWord {

	public static void main(String[] args) {
		
		String w1="listen";
		String w2 = "silent";
		
		boolean isAnagram=true;
		
		char[] arr1 = w1.toCharArray();
		char[] arr2 = w2.toCharArray();
		
		int l1= arr1.length;
		int l2 = arr2.length;
		
		if(l1!=l2) {
			System.out.println("The given strings are not anagram");
		}
		else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			for(int i=0;i<l1;i++) {
				if(arr1[i]!=arr2[i]) {
					System.out.println("not anagram");
					isAnagram=false;
					break;
				}
				
			}
		}
		if(isAnagram) {
			System.out.println("The given words are anagram");
		}
		
	}
}
