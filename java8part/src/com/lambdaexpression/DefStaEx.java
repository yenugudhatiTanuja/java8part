package com.lambdaexpression;

public interface DefStaEx {
	public default void show()
	{
		System.out.println("In java 8-DefaultStaticExampleInterface");
	}
	public static void display()
	{
		System.out.println("In DefaultStaticExampleInterface");
	}
   void message();
}
