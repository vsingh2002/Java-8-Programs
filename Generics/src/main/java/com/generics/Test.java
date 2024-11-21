package com.generics;
/*
 *  Generic Bounded Type
 *  We can bound the type parameter for a particular range by using extends keyword. 
 */
public class Test<T extends Number> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Test<Integer> i = new Test<>();
		i.setValue(101);
		System.out.println("Integer is:" + i.getValue());
		Test<Float> f = new Test<>();
		f.setValue(101.20f);
		System.out.println("Float is:" + f.getValue());

	}
}
