package com.java8;

//Approach 1
public class ThreadDemo1 implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		ThreadDemo1 td1 = new ThreadDemo1();
		Thread t = new Thread(td1);
		t.start();
	}

}
