package com.mindgate.pojo;

public class B extends A {

	public B() {
		System.out.println("Hello");
	}
	
	public B (int x)
	{
		super(x);//metnioning explicitly for Parameterized Constructor
		System.out.println("Overloaded/Parameterized Constructor of B");
	}
}
