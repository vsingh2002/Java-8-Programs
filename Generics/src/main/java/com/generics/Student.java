package com.generics;

//Generic Class-If any class is declared with type parameters then it's a generic class
public class Student<N, R> {
	private N name;
	private R rollNo;

	public N getName() {
		return name;
	}

	public void setName(N name) {
		this.name = name;
	}

	public R getRollNo() {
		return rollNo;
	}

	public void setRollNo(R rollNo) {
		this.rollNo = rollNo;
	}
	public static void main(String[] args) {
		Student<String, Integer> s1 = new Student<>();
		s1.setName("Vishal");
		s1.setRollNo(8);
		System.out.println("Name is:" + s1.getName());
		System.out.println("Roll no:" + s1.getRollNo());

	}

}
