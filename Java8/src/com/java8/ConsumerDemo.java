package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> c = (name) -> System.out.println(name + " " + "Good morning");
		c.accept("Vishal");
		c.accept("Mohan");
		c.accept("Virat");
		List<Integer> numbers = Arrays.asList(10, 30, 40, 50, 60);
		// Using forEach we traversing
//		for (Integer number : numbers) {
//			System.out.println(number);
//		}
		// Using supplier we are traversing the list of a numbers
		 numbers.forEach(i -> System.out.println(i));
	}
}
