package com.lambdaexpression;

import java.util.ArrayList;

public class LamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("***Integers***");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	    System.out.println("***String***");
	    ArrayList<String> n1=new ArrayList<String>();
	    n1.add("Red");
	    n1.add("Blue");
	    n1.add("Orange");
	    n1.add("Green");
        n1.forEach((s)->{System.out.println(s);});
	}

}
