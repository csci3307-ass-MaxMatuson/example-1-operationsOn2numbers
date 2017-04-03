/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

import java.util.Scanner;
import com.mycompany.basicmathoperations.oop.Multiply;
import com.mycompany.basicmathoperations.oop.Divide;
import com.mycompany.basicmathoperations.oop.Addition;

/**
 * @author ilker
 *
 */
public class MainEntry4oop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("BEF main of MainEntry4oop with args:" + args);
		
		// get inputs
		Scanner scanner = new Scanner(System.in);
		float number1, number2;
		float resultM, resultD, resultA, resultS;
		
		System.out.println("Enter 2 numbers:\nThe multiplication, division, addition and subtraction will be outputted"
				+ "\n---------------------------------------------------------------------------");
		// read number 1 and number 2 inputs
		System.out.println("Enter number 1");
		number1 = scanner.nextFloat();
		System.out.println("Enter number 2");
		number2 = scanner.nextFloat();
		
		// Multiply block
		Multiply multiplier = new MultiplyOperatorFor2numbers(number1, number2);
		resultM = multiplier.multiply(number1, number2);
		System.out.printf("result of multiply(float, float) is %.2f%n", resultM);
		resultM = multiplier.multiply2numbers();
		System.out.printf("result of multiply2numbers() is %.2f%n", resultM);
		
		// Divide block
		Divide division = new DivideOperatorFor2Numbers(number1, number2);
		resultD = division.divide(number1, number2);
		System.out.printf("result of divide(float, float) is %.2f%n", resultD);
		resultD = division.divide2Numbers();
		System.out.printf("result of divide2Numbers() is %.2f%n", resultD);
		
		// Add block
		Addition add = new AddOperatorFor2Numbers(number1, number2);
		resultA = add.add(number1, number2);
		System.out.printf("result of add(float, float) is %.2f%n", resultA);
		resultA = add.add2Numbers();
		System.out.printf("result of add2Numbers() is %.2f%n", resultA);
		
		// Subtract block
		Subtract subtraction = new SubtractOperatorFor2Numbers(number1, number2);
		resultS = subtraction.subtract(number1, number2);
		System.out.printf("result of subtract(float, float) is %.2f%n", resultS);
		resultS = subtraction.subtract2Numbers();
		System.out.printf("result of subtract2Numbers() is %.2f%n", resultS);
		
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		System.out.printf("-----------------------------------\n");
		System.out.printf("Multiplication: "+number1+" * "+number2+" = %.2f%n", resultM);
		System.out.printf("\nDivide: "+number1+" / "+number2+" =  %.2f%n", resultD);
	 	System.out.printf("\nAddition: "+number1+" + "+number2+" = %.2f%n", resultA);
		System.out.printf("\nSubtraction: "+number1+" - "+number2+" = %.2f%n", resultS);
		scanner.close();
	}

}
