package com.java8;

@FunctionalInterface
interface AddOperation {
	void add(int a, int b);
}

public class AddLambda {
	public static void main(String[] args) {
		AddOperation addOperation = (a, b) -> System.out.println(a + b);

		// Calling the method
		addOperation.add(10, 20);

	}

}
