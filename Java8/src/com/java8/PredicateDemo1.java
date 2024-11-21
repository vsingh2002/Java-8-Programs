package com.java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

// declare name in array and print the name which is starting with A using lambda expression
public class PredicateDemo1 {
	public static void main(String[] args) {
		String name[] = { "Neha", "Anushka", "Virat", "Anupama", "Viru" };
		Predicate<String> p = names -> names.charAt(0) == 'A';
		for (String names : name) {
			if (p.test(names)) {
				System.out.println(names);
			}
		}
		System.out.println("===========================================");
		BiPredicate<Integer, Integer> bip = (i, j) -> (i + j) >= 20;
		System.out.println(bip.test(10, 12));
		System.out.println(bip.test(16, 2));

	}

}
