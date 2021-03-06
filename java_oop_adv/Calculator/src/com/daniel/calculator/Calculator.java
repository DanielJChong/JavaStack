package com.daniel.calculator;

public class Calculator {
	private double operandOne;
	private String operation;
	private double operandTwo;
	private double result; 

	public Calculator setOperandOne(double op) {
		this.operandOne = op;
		return this;
	}
	public Calculator setOperation(String operation) {
		this.operation = operation;
		return this;
	}
	public Calculator setOperandTwo(double op) {
		this.operandTwo = op;
		return this;
	}
	

	public Calculator performOperation() {
		if(operation == "plus" || operation == "+") {
			this.result = this.operandOne + this.operandTwo;
		}
		else if(operation == "minus" || operation == "-") {
			this.result = this.operandOne - this.operandTwo;
		}
		return this;
	}

	public double getResult(){
		return this.result;
	}
}
