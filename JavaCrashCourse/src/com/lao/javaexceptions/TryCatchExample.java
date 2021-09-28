package com.lao.javaexceptions;

public class TryCatchExample {
	
	public static void main(String[] args) {
	
	try
	{
		int a=10;
		int b=0;
		int c =a/b;
		
	}catch(ArithmeticException e) {
		System.out.println("Number could not be divided by 0");
	}
	catch(Exception e)
	{
    System.out.println("Arithmentic Exception");
   }
                                      }
}
