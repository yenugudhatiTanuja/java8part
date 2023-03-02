package com.lambdaexpression;

import java.util.Scanner;

public class ExPA  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(); 
        int b=s.nextInt();
         
        // lambda  
        AddLam d2=()->{  
            System.out.println("sum "+(a+b));  
        };  
        d2.add();  
	}

}
