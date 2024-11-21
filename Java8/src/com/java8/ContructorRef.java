package com.java8;

import java.util.function.Supplier;

public class ContructorRef {
	public static void main(String[] args) {
		Supplier<Doctor> s = Doctor::new;
		Doctor doctor=s.get();
		System.out.println(s.hashCode());
	}

}

class Doctor {
	Doctor() {
		System.out.println("Contructor reference");
	}
}
