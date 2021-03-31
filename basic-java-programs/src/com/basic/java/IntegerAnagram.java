package com.basic.java;

import java.util.Arrays;

public class IntegerAnagram {

	public static void main(String[] args) {
		int n1 = 1234;

		int i1 = 4312;

		int[] int1 = new int[10];
		int[] int2 = new int[10];

		boolean isAnagram = true;

		int1 = toIntArray(n1);

		int2 = toIntArray(i1);

		Arrays.sort(int1);
		Arrays.sort(int2);

		for (int i = 0; i < 10; i++) {
			if (int1[i] != int2[i]) {
				isAnagram = false;
				break;
			}
		}
		if (isAnagram) {
			System.out.println("the given int is anagaram");
		} else {
			System.out.println("not anagagram");
		}
	}

	public static int[] toIntArray(int num) {
		int[] digit = new int[10];
		int i = 0;
		while (num != 0) {

			digit[i] = num % 10;
			num = num / 10;
			i++;
		}

		return digit;
	}

}
