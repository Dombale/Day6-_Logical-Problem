package com.blz;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String args[]) {
		int sum = 0;
		int i = 1;
		System.out.print("Enter the number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}

		// compares sum with the number
		if (sum == num) {
			// prints if sum and num are equal
			System.out.println(num + " is a perfect number.");
		} // end of if
		else
			// prints if sum and num are not equal
			System.out.println(num + " is not a perfect number.");
	}

}
