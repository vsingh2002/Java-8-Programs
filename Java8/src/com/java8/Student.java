package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
	// using predicate function its simply returns in true or false
	public static void main(String[] args) {
		Predicate<Integer> isEven = x -> x % 2 == 0;
		List<Integer> num = Arrays.asList(3, 5, 6, 8, 9, 12, 68);
		for (Integer i : num) {
			if (isEven.test(i)) {
				System.out.print(i + " ");
			}
		}
		// Using function
		Function<String, Integer> fn = y -> y.length();
		System.out.println();
		System.out.println(fn.apply("Vishal"));
	}

}
