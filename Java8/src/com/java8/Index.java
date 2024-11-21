package com.java8;

import java.util.ArrayList;

public class Index {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vishal");
		al.add("Mohan");
		al.add("Ramu");
		// Iterating string using forEach()method
		al.forEach(i -> System.out.println(i));
	}

}
