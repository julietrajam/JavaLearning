package com.lao.javaexceptions;

public class TryCatchFinallyExample {
	
	public static int dummy()
	{
		return 2;
	}
   public static void main(String[] args) {
	
	   try
	   {
		   System.out.println("Inside try block");
		   System.out.println(TryCatchFinallyExample.dummy());
		   System.out.println("After Exception"); //will not print since previous line throws exception control passed to catch block
	   }
	   catch(Exception e)
	   {
		   System.out.println("Inside catch block");
	   }
	   finally{
		   System.out.println("Inside Finally block");
	   }
}
}
