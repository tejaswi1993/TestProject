package com.basic.java;

import java.util.ArrayList;
import java.util.List;

public class MphasisCode {

	public static void main(String[] args) {
		String [] nums = {"111", "213", "123", "111", "456"};
		  List<String> p = new ArrayList<String>();
		  int len = nums.length;
		  
		  for(int i=0; i<len;i++)
		  
		  {
		   
		      if( !p.contains(nums[i]))
		      {
		        p.add(nums[i]);
		       // String s = nums[i];
		        int num1= Integer.parseInt(nums[i]);
		        
		        
		        int sum=0;
		        while(num1 !=0)
		                {
		          sum = sum+(num1%10);
		          num1 = num1/10;
		          
		      
		        }
		        System.out.println(nums[i] + ":" + sum);
		        
		      }
		     
		      
		    }
		    
		  }
	}

