package com.java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PredicateDemo {
	public static void main(String[] args) {
		// Predicate and bi-predicate - its basically checks
//		Predicate<Integer> pr = x -> x % 2 == 0;
//		BiPredicate<Integer, Integer> bipr = (x, y) -> x % 2 == 0 || y % 2 == 0;
//		BiPredicate<String, Integer> bipre = (str, x) -> str.length() == x;
//		System.out.println(bipre.test("Vishal", 6));
//		System.out.println(bipr.test(25, 10));
//		System.out.println(pr.test(45));
//		// Function and bi-function its checks and returns the value
//		Function<String, Integer> fn = str -> str.length();
//		System.out.println(fn.apply("Vishal"));
//		BiFunction<String, String, Integer> bifn = (x, y) -> x.length() + y.length();
//		System.out.println(bifn.apply("Vishal", "Singh"));
//		// Consumer and bi-consumer it basically consume it basically used to store in database
//		Consumer<String> con = (x) -> {
//			System.out.println(x);
//		};
//		con.accept("Vishal");
//
//	}
//	
//		BiConsumer<String, String> biconsumer = (x, y) -> {
//			System.out.println(x.length() + y.length());
//		};
//		biconsumer.accept("Vishal", "Singh");
		// Using function and unaryoperator
		Function<Integer, Integer> fn = x -> x * x;
		System.out.println(fn.apply(6));
		UnaryOperator<Integer> ur = x -> x * x;
		System.out.println(ur.apply(5));
		BinaryOperator<String> binary = (x, y) -> x.concat(y);
		System.out.println(binary.apply("Hello", "Vishal"));

	}

}
