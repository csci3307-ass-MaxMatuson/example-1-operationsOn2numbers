package com.mycompany.basicmathoperations.oop;

public class AddOperatorFor2Numbers extends OperatorFor2numbers implements Addition {

	public AddOperatorFor2Numbers() {
//		super();	// NOTE Max if you don't call parent's constructor in a child class' constructor, 
//		java will automatically call default constructor of parent
	}
	
	public AddOperatorFor2Numbers(float _number1, float number2) {
		super(_number1,number2);	// NOTE 1st the parent's constructor executes
	}

	public AddOperatorFor2Numbers(float number1, float number2, String junk) {
		this(number1, number2);	// NOTE 1st the constructor above runs
		Float someJunk = this.add(number1, number2);
		System.out.println("junk:" + junk);	
	}
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public float add(float num1, float num2) {
		return num1 + num2;
	}

	@Override
	public float add2Numbers() {
		return number1 + number2;
	}

}
