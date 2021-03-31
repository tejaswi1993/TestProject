package com.basic.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MappingExcersise {

	public static void main(String[] args) {
		Map<String,String> loans = new HashMap<String,String>();
		
		loans.put("loan1", "Student loan");
		loans.put("loan2", "Home Loan");
		loans.put("loan3", "business loan");
		
		//Different types of Interator/looping techniques
		
		//Using for each loop
		
//		for(String key : loans.keySet()) {
//			
//			System.out.println("------------------------------------------------------------------------");
//			System.out.println("Iterating or looping map using for each loop");
//			System.out.println("Key :" + key+  "   value :" +loans.get(key));
//			
//		}
			
		//using Iterator  Iterator
//		
//		Set<String> keySet = loans.keySet();
//		
//		Iterator<String> keySetIterator = keySet.iterator();
//		
//		while(keySetIterator.hasNext()) {
//			System.out.println("---------------------------------------------------------------------------");
//			System.out.println("Iterating or looping map using keySet");
//			String key = keySetIterator.next();
//			System.out.println("Key  :"  +key+  "   value  :"  +loans.get(key) );
//			
//		}
		
		
		//using entrySet iterator
		
//		Set<Map.Entry<String, String>> entrySet = loans.entrySet();
//		
//		for(Entry<String, String> entry : entrySet) {
//			System.out.println("---------------------------------------------------------------------------------");
//			System.out.println("Iterating or looping map using entrySet");
//			System.out.println("Key  :" +entry.getKey() + "     value is "+entry.getValue());
//			
//		}
		
		//using Iterator and entrySet 
		
		Set<Map.Entry<String, String>> entrySet = loans.entrySet();
		Iterator<Entry<String, String>> entrySetIterator = entrySet.iterator();
		
		while(entrySetIterator.hasNext()) {
			
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Iterating or looping map using entrySet and Iterator");
			Entry entry = entrySetIterator.next();
			System.out.println("Key  :" +entry.getKey()+ "   value is " +entry.getValue());
		}
			
		
	}
}
