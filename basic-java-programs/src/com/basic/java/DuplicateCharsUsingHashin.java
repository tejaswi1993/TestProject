package com.basic.java;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsUsingHashin {

	public static void main(String[] args) {
		
		String word = "howtodoinjava dot com";
		
		char[] charArr = word.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c : charArr) {
			if(map.containsKey(c)) {
				int counter = map.get(c);
				map.put(c, ++counter);
			}
			else {
				map.put(c, 1);
			}
		}
		
		//to find duplicate chars
		System.out.println("The duplicate chars are : ");
		for(char c : map.keySet()) {
			if(map.get(c) >1) {
				System.out.println(c);
			}
		}
		
		//to find distinct chars
		
		  System.out.println("THe distict chars are :");
		  for(char c:map.keySet()) {
		  if(map.get(c) == 1) { 
			  System.out.println(c);
			  } 
		  }
		 
		
		
	}
}
