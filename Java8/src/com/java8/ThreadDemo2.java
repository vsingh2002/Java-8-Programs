package com.java8;

public class ThreadDemo2 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}
		};
		Thread t = new Thread(runnable);
		t.start();

	}

}
