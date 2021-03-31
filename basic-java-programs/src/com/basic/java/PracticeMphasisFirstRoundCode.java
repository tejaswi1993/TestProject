package com.basic.java;

import java.util.ArrayList;
import java.util.List;

public class PracticeMphasisFirstRoundCode {

	public static void main(String[] args) {
		String[] nums = {"111","123","122","111"};
		
		List<String> p = new ArrayList<String>() ;
		int len = nums.length;
		
		for(int i=0;i<len;i++) {
			if(!p.contains(nums[i])) {
				p.add(nums[i]);
				
				int num = Integer.parseInt(nums[i]);
				
				int sum =0;
				while(num!=0) {
					sum = sum+(num%10);
					num= num/10;
					
				}
				System.out.println(nums[i] + ":" + sum);
			}
		}
		
		
	}
}
