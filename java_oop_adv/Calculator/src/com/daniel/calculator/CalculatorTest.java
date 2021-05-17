package com.daniel.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();

		c.setOperandOne(10.5).setOperation("+").setOperandTwo(5.2);
		System.out.println(c.performOperation().getResult());

	}

}
