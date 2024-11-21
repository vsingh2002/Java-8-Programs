package com.generics;
// Generic enum
enum Operation {
	ADD, SUBTRACT, MULTIPLY, DIVIDE;
public <T extends Number> double apply(T a, T b) {
		switch (this) {
		case ADD:
			return a.doubleValue() + b.doubleValue();
		case SUBTRACT:
			return a.doubleValue() - b.doubleValue();
		case MULTIPLY:
			return a.doubleValue() * b.doubleValue();
		case DIVIDE:
			if (b.doubleValue() == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			return a.doubleValue() / b.doubleValue();
		default:
			throw new AssertionError("Unknown operation: " + this);
		}
	}
}
public class EnumPractice {
	public static void main(String[] args) {
		// Using the apply method with different numeric types
		double result1 = Operation.ADD.apply(10, 20); // Integers
		System.out.println("Addition Result: " + result1);

		double result2 = Operation.SUBTRACT.apply(25.5, 10.2); // Doubles
		System.out.println("Subtraction Result: " + result2);

		double result3 = Operation.MULTIPLY.apply(4.5f, 2.0f); // Floats
		System.out.println("Multiplication Result: " + result3);

		double result4 = Operation.DIVIDE.apply(50, 5); // Integers
		System.out.println("Division Result: " + result4);
	}
}
