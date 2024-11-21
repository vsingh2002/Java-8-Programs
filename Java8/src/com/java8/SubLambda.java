package com.java8;

@FunctionalInterface
interface SubOperation {
	void sub(int a, int b);
}

class SubLambda {
	public static void main(String[] args) {
		SubOperation subOperation = (a, b) -> {
			System.out.println(a - b);
		};
		subOperation.sub(20, 10);
	}

}
