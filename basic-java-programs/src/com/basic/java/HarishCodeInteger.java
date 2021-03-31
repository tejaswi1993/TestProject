package com.basic.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HarishCodeInteger {

	public static void main(String[] args) {
		
		String[] nums = {"444","234","234","444"};
		
		Map<String,Integer> map = new HashMap<>();
		
		int len = nums.length;
		
		for(int i=0;i<len;i++) {
			
			if(map.containsKey(nums[i])) {
				int count = map.get(nums[i]);
				map.put(nums[i], count+1);
				
			}
			else
				map.put(nums[i], 1);
			
		}
	
		Set<String> set = map.keySet();
		for(String s : set) {
			if(map.get(s) > 1) {
			
				int sum = 0;
				int num = Integer.parseInt(s);
				
				while(num!=0) {
					sum = sum + (num%10);
					num = num/10;
				}
				System.out.println(s + ":" + map.get(s) + ":" + sum);
			}
			
		}
		
		
		
	}
}
