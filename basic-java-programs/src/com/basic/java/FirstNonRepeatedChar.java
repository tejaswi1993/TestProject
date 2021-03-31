package com.basic.java;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String s1 = "physicsp";

		char[] chars = s1.toCharArray();

		char[] chars2 = new char[1];

		Map<Character, Integer> map = new HashMap<>();

		for (char c1 : chars) {
		
			if (map.containsKey(c1)) {
				int counter = map.get(c1);

				map.put(c1, counter + 1);
			} else {
				map.put(c1, 1);
			}
		}

		for (char c : chars) {
			if (map.get(c) == 1) {
				chars2[0] = c;
				System.out.println(chars2[0]);
				break;
			}

		}
		
		for (char c : chars) {
			
				
				System.out.println(c + " -  " +map.get(c));
				
			

		}
	}
}
