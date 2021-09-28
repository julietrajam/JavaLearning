package com.lao.PolymorphismExample;

public class OverloadingExample {
	
	public void disp(int a)
	{
		System.out.println("Value of a:"+a);
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingExample o1 = new OverloadingExample();
		o1.disp(1);
		o1.disp(2,3);
		o1.disp(4,5,6);
		
	}

}
