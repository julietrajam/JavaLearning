package com.lao.abstraction;

public class Tesla extends Car{

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Tesla Engine");
		
	}

	@Override
	public void companyValut() {
		// TODO Auto-generated method stub
		System.out.println("Tesla Company");
	}
	
	public static void main(String[] args) {
		
		Tesla o1= new Tesla(); //Dynamic Polymorphism
		o1.engine();
		o1.companyValut();
		o1.CarFeature();
		
		}

	
}
