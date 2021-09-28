package com.lao.PolymorphismExample;

public class TypeofArgOverloadingExample {

	public void disp(int a)
	{
		System.out.println("Value of a:"+a);
	}
	
	public void disp(int a,float b)
	{
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
	
	public void disp(int a,int b)
	{
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
	
	public void disp(int a,int b,int c)
	{
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		System.out.println("Value of c:"+c);
	}
	
	public void disp(int a,String b,int c)
	{
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		System.out.println("Value of c:"+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeofArgOverloadingExample o1 = new TypeofArgOverloadingExample();
		o1.disp(1,"Juls",4);
		
	}

}
