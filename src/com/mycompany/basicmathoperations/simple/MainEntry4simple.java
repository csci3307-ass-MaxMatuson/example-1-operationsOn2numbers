/**
 * 
 */
package com.mycompany.basicmathoperations.simple;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ilker
 *
 */
public class MainEntry4simple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEF main of MainEntry4simple with args:" + args);
		System.out.println("still main of MainEntry4simple with args:" + Arrays.toString(args));
		
		// get inputs
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		float result1, result2;
		// read number 1 and number 2 inputs
		System.out.println("Enter number 1");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2");
		number2 = scanner.nextInt();
		
		// Multiply block
		Multiply multiplier = new Multiply();
		result1 = multiplier.multiply(number1, number2);
		
		// Divide block
		Divide division = new Divide();
		result2 = division.divide(number1, number2);
		
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		System.out.printf("result of multiplication is %.2f%n", result1);
		System.out.printf("\nresult of divide is %.2f%n", result2);
		scanner.close();
	}

}
