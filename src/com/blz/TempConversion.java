package com.blz;

import java.util.Scanner;

public class TempConversion {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Temperature in celsius is:");
		double celsius = s.nextDouble();// take input from user Temperature in celsius.
		double tempinF = ((celsius * 9) / 5) + 32;// used Celsius to Fahrenheit conversion formula.
		System.out.println("celsius Temperature in fahrenheit is:" + tempinF);
		System.out.println("Enter Temperature in fahrenheit is:");
		double fahrenheit = s.nextDouble();// take input from user Temperature in fahrenheit.
		double tempinC = ((fahrenheit - 32) * 5) / 9;// used Fahrenheit to Celsius conversion formula.
		System.out.print("fahrenheit Temperature in celsius is:" + tempinC);

	}

}
