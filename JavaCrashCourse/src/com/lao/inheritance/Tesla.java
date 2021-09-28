package com.lao.inheritance;

public class Tesla extends Car{
	
	public static void main(String[] args) {
		
		Tesla o1 = new Tesla();
		System.out.println("Wheels of my cars are:"+o1.wheel);
		o1.aboutthecar();
		
	}

}
