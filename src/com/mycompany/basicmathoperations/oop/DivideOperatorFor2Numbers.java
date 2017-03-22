package com.mycompany.basicmathoperations.oop;

public class DivideOperatorFor2Numbers extends OperatorFor2numbers implements Divide {
	
	public DivideOperatorFor2Numbers() {
//		super();	// NOTE ilker if you don't call parent's constructor in a child class' constructor, 
//		java will automatically call default constructor of parent
	}
	
	public DivideOperatorFor2Numbers(float _number1, float number2) {
		super(_number1,number2);	// NOTE 1st the parent's constructor executes
		System.out.println("parent's number1 is " + super.number1);
		System.out.println("_number1:" + _number1);
		System.out.println("number2 Sabrina says whatever:" + number2);
	}

	public DivideOperatorFor2Numbers(float number1, float number2, String junk) {
		this(number1, number2);	// NOTE 1st the constructor above runs
		Float someJunk = this.divide(number1, number2);
//		super(number1,number2);
//		System.out.println("number1:" + number1);
//		System.out.println("number2: Sabrina says whatever:" + number2);
		System.out.println("junk:" + junk);
	}
	
	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}

	@Override
	public float divide(float num1, float num2) {
		return num1 / num2;
	}

	@Override
	public float divide2Numbers() {
		return number1 / number2;
	}

}
