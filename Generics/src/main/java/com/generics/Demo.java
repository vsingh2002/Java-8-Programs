package com.generics;

/*
 * Generic Constructor
 */
public class Demo {
	public <T> Demo(T value) {
		System.out.println("Generic constructor called is:" + value);
	}

	public static void main(String[] args) {
		Demo d1 = new Demo("Vishal");
		Demo d2 = new Demo(101);
		Demo d3 = new Demo(45.67);
		Demo d4=new Demo(101.72);
		Demo d5=new Demo("Singh");
	}

}
