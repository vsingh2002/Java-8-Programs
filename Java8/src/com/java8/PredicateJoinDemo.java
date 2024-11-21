package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String name;
	String location;
	String dept;

	Employee(String name, String location, String dept) {
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
}

public class PredicateJoinDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Vishal", "Bangalore", "Java Dev");
		Employee e2 = new Employee("Viru", "Noida", "Web Dev");
		Employee e3 = new Employee("Mohan", "Mangalore", "SDET");
		Employee e4 = new Employee("Vidja", "Lahore", "QA");
		List<Employee> employee = Arrays.asList(e1, e2, e3, e4);
		Predicate<Employee> predicate1 = e -> e.location.equals("Lahore");
		Predicate<Employee> predicate2 = e -> e.dept.equals("QA");
		// Predicate Joining
		Predicate<Employee> p = predicate1.and(predicate2);

		for (Employee e : employee) {
			if (p.test(e)) {
				System.out.println(e.name);
			}
		}

	}

}
