package com.lao.staticexamples;

public class StaticMethodExample {

	public static void method1() {
		
		System.out.println("Static Method1");
	}
	
    public static void method2() {
		
		System.out.println("Static Method2");
	}
    
    public void nonstaticmenthod()
    {
    	method2();
    	System.out.println("Non Static Method");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();
		
		StaticMethodExample o1= new StaticMethodExample();
		o1.nonstaticmenthod();
		
	}

}
