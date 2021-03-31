package com.basic.java;

public class MphasisCodeIntege {

	static int printMax() {
		int number = 5465;
		int digit = 6;

		String s = Integer.toString(number);
		StringBuilder s1 = new StringBuilder();

		if (s.charAt(0) != '-') {
		System.out.println("positive");
		for (int i = 0; i < s.length() - 1; i++) {
		if (s.charAt(i) - '0' < digit) {

		s1.append(s.substring(0, i));
		s1.append(Integer.toString(digit));
		s1.append(s.substring(i));

		break;
		}
		}
		if (s1.length() == 0) {
		System.out.println("empty");
		s1.append(s);
		s1.append(digit);
		}
		} else {
		System.out.println("negative");

		for (int i = 1; i < s.length() - 1; i++) {
		if (s.charAt(i) - '0' > digit) {

		s1.append(s.substring(0, i));
		s1.append(Integer.toString(digit));
		s1.append(s.substring(i));


		}
		break;

		}
		}

		if (s1.length() == 0) {
		s1.append(s);
		s1.append(digit);
		}
		int res = Integer.parseInt(s1.toString());
		
		return res;
	}
		

	public static void main(String[] args) {
		System.out.println(printMax());

	}
}