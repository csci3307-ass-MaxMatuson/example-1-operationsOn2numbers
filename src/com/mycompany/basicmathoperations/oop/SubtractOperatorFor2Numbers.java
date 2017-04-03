package com.mycompany.basicmathoperations.oop;

public class SubtractOperatorFor2Numbers extends OperatorFor2numbers implements Subtract {

	public SubtractOperatorFor2Numbers() {
//		super();	// NOTE Max if you don't call parent's constructor in a child class' constructor, 
//		java will automatically call default constructor of parent
	}
	
	public SubtractOperatorFor2Numbers(float _number1, float number2) {
		super(_number1,number2);	// NOTE 1st the parent's constructor executes
	}

	public SubtractOperatorFor2Numbers(float number1, float number2, String junk) {
		this(number1, number2);	// NOTE 1st the constructor above runs
		Float someJunk = this.subtract(number1, number2);
		System.out.println("junk:" + junk);	
	}
	
	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public float subtract(float num1, float num2) {
		return num1 - num2;
	}

	@Override
	public float subtract2Numbers() {
		return number1 - number2;
	}

}
