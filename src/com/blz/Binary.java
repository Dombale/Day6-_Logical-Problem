package com.blz;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int newnum;
		Scanner s = new Scanner(System.in); // take input from user nth time series want.
		System.out.println("Enter integer to convert into binary:");
		int num = s.nextInt();
		System.out.println("Binary String is :" + Integer.toBinaryString(num)); // function used to convert integer into
		System.out.println("Before Swapping number is: " + num); // binary.

		newnum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);// use to swapping nibbles.

		System.out.println("After Swapping number is: " + newnum);
		s.close();
		if ((newnum != 0) & ((newnum & (newnum - 1)) == 0)) { // check Power of two
			System.out.println(newnum + " Number is power of 2");
		} else
			System.out.println(newnum + " Number is not power of 2");// Ex(.swapping 3=48, its not power of 2.)
	}
}

/*
 * Ex. if num binary 2 is 00000010 AND with 0F is 00001111 = 00000010, now shift
 * the nibbles <<4 to right.after shift o/p will be 0010. 0F & num = 00001111 &
 * 00000010 = 00000000, now shift the nibbles >> by to left after shift o/p will
 * be 0000. Now we do OR operation between swapping nibbles 0010 0000 | 0000
 * 0000, o/p is 0010 0000 = 32 its swap number, AND opration between (n &
 * n-1)=0, and !=0, given number is Power of two.Ex(.swapping 2=32, its power of
 * 2)
 * 
 */
