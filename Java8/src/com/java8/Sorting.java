package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Using Comparator
public class Sorting {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(24);
		l.add(32);
		System.out.println("Before sorting:" + l + " ");
		// Default sorting
		Collections.sort(l);
		System.out.println("After sorting:" + l + " ");
		// Using lambda Expression sorting in descending order
		Collections.sort(l, (a, b) -> b - a);
		System.out.println("Using lambda:" + l + " ");
	}

}
