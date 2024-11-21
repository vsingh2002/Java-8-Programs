package com.java8;

import java.util.function.Predicate;

public class PredicateDemoo {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 10;
		// p.test(10);
		System.out.println(p.test(5));
	}

}
