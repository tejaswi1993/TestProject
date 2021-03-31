
package com.basic.java;

public class DuplicateCharsInArray {

	public static void main(String[] args) {
		String[] my_arr = {"bcd","bhd","bcd","shj","bhd"};
		
		for(int i=0;i<my_arr.length;i++){
			for(int j= i+1;j<my_arr.length;j++) {
				if(my_arr[i].equals(my_arr[j])) {
					System.out.println("Duplicate elements are "+my_arr[j]);
				}
			}
		}
	}
}
