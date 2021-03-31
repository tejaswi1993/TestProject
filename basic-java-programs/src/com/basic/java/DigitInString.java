package com.basic.java;

import java.util.regex.Pattern;

public class DigitInString {

	public static void main(String[] args) {
		String s1 = "qwe34";
		
		Pattern p = Pattern.compile("[0-9]+");
		boolean b = p.matcher(s1).matches();
		if(b) {
			System.out.println("String has only digits");
		}
		else {
			System.out.println("String has chars");
		}
	}
}
	
		
		

//		try {
//			Integer.parseInt(s1);
//			System.out.println("String has digits");
//		}
//		catch(Exception e) {
//				e.printStackTrace();
//				System.out.println(e);
//				System.out.println("String has non digits");
//		}
//	}
//}
		


