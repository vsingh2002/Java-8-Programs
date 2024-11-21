package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

// Take list of a person  and print persons whose age is > 18
public class PredicateDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("Vishal", 22);
		Person p2 = new Person("Viru", 32);
		Person p3 = new Person("Tara", 12);
		Person p4 = new Person("Pooja", 16);
		Person p5 = new Person("Vishal", 22);
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);

		Predicate<Person> predicate = p -> p.age >= 18;
		for (Person person : persons) {
			if (predicate.test(person)) {
				System.out.println(person.name);
			}
		}

	}

}
