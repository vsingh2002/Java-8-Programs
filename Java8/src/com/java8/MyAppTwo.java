package com.java8;

@FunctionalInterface
interface MyInterfaceTwo {
	public void m1();

}

public class MyAppTwo {
	public static void main(String[] args) {
		MyInterfaceTwo mit = () -> System.out.println("m1 method called");
		mit.m1();

	}

}
