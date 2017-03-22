/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

import java.util.Scanner;
import com.mycompany.basicmathoperations.oop.Multiply;
import com.mycompany.basicmathoperations.oop.Divide;

/**
 * @author ilker
 *
 */
public class MainEntry4oop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEF main of MainEntry4oop with args:" + args);
		
		// get inputs
		Scanner scanner = new Scanner(System.in);
		float number1, number2;
		float result1, result2;
		// read number 1 and number 2 inputs
		System.out.println("Enter number 1");
		number1 = scanner.nextFloat();
		System.out.println("Enter number 2");
		number2 = scanner.nextFloat();
		
		// Multiply block
		Multiply multiplier = new MultiplyOperatorFor2numbers(number1, number2);
		result1 = multiplier.multiply(number1, number2);
		System.out.printf("result of multiply(float, float) is %.2f%n", result1);
		result1 = multiplier.multiply2numbers();
		System.out.printf("result of multiply2numbers() is %.2f%n", result1);
		
		// Divide block
		Divide division = new DivideOperatorFor2Numbers(number1, number2);
		result2 = division.divide(number1, number2);
		System.out.printf("result of divide(float, float) is %.2f%n", result2);
		result2 = division.divide2Numbers();
		System.out.printf("result of divide2Numbers() is %.2f%n", result2);
		
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		System.out.printf("\nresult is %.2f%n", result1);
		System.out.printf("result is %.2f%n", result2);
		scanner.close();
	}

}
