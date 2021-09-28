package com.lao.staticexamples;

public class StaticBlocks {

	static {
		
		System.out.println("Static block1");
	}
	
    static {
		
		System.out.println("Static block2");
	}
    
    public static void main(String[] args) {
		
    	//StaticBlocks o1 = new StaticBlocks();
    	System.out.println("Inside main method");
    	
	}
	
}
