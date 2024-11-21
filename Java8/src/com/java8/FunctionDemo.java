package com.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Integer> fn = (name) -> name.length();
		System.out.println(fn.apply("Vishal Singh"));
		System.out.println(fn.apply("VirendraSehwag"));
		System.out.println(fn.apply("Bangalore, Karnataka"));
		System.out.println("=======================");
		BiFunction<Integer, Integer, Integer> bif = (a, b) -> a + b;
		System.out.println(bif.apply(20, 20));
	}
}
