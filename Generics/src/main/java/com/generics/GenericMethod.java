package com.generics;
/*
 * Generic Method implementation
 */
public class GenericMethod {
	public <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void display(Integer element) {
		System.out.println("Integer element is:" + element);
	}

	public static <T> void display(T element) {
		System.out.println("Generic element is:" + element);
	}

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		Integer[] intArray = { 10, 20, 30 };
		String stringArray[] = { "Hello", "Good Morning", "Good Afternoon" };
		gm.printArray(intArray);
		gm.printArray(stringArray);
		display(101);
		display("String");

	}

}
