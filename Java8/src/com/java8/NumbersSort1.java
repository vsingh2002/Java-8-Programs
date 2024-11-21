package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Sort the arraylist in decending order without using lambda 
public class NumbersSort1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(4);
		al.add(6);
		al.add(8);
		System.out.println("Before Sorting :" + al);
		// Collections.sort(al, new NumberComparator());
		// using lambda
		Collections.sort(al, (i, j) -> (i > j) ? -1 : 1);
		System.out.println("After sorting:" + al);
		System.out.println("Using for each method ");
		al.forEach(i -> System.out.print(i + " "));
	}

}
// 

//class NumberComparator implements Comparator<Integer> {
//
//	public int compare(Integer i, Integer j) {
//		if (i > j) {
//			return -1;
//		} else if (i < j) {
//			return 1;
//		} else
//			return 0;
//	}
//}