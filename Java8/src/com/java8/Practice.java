package com.java8;

interface Practice 
{
	public void run();
	default void eat()
	{
		System.out.println("Eating");
	}
	

}
