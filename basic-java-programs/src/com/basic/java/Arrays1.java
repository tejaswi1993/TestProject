package com.basic.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays1 {
	  public static void main(String[] args) {
	 List<String> colors = new ArrayList<String>();
	  

	  colors.add("Red");
	  colors.add("Blue");
	  colors.add("White");
	  colors.add("Black");
	  colors.add(0,"Green");
	  int len = colors.size();
	  colors.set(2,"Pink");
	  System.out.println("The List of colors are :" +colors);
	//  colors.remove(3);
	  
//	  for(int i=0; i<len;i++){
//	    System.out.println("The List of colors are :" + colors.get(i));
//	  }
	  
	  //System.out.println("The List of colors are :" +colors.get(2));
	 // System.out.println("The List of colors after removing are :" +colors);
	  
//	  if(colors.contains("White")) {
//		  System.out.println("Found the Element");
//	  }
//	  else
//		  System.out.println("ELement is not found");
	  System.out.println("The list before sorting : " +colors);
	  Collections.sort(colors);
	  System.out.println("The list after sort " + colors);
	  }
	 }
	

