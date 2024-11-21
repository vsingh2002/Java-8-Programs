package com.java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
//		String s1 = "Vishal";
//		String s2 = "Singh";
//		System.out.println(s1+"-"+s2);
		StringJoiner sj = new StringJoiner("-");
		sj.add("Vishal");
		sj.add("Singh");
		System.out.println(sj);
	}

}
