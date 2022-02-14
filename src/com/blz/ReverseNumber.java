package com.blz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int Reminder;
		int Reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Original Number: ");
		int Number = sc.nextInt();

		// run loop until num becomes 0
		while (Number > 0) {
			Reminder = Number % 10;
			Reverse = Reverse * 10 + Reminder;
			Number = Number / 10;
		}

		System.out.println("Reversed Number: " + Reverse);
	}
}
