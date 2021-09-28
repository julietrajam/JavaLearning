package com.lao.abstraction;

public class BMW extends Car {

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("BMW Engine");
	}

	@Override
	public void companyValut() {
		// TODO Auto-generated method stub
		System.out.println("BMW Company");
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car o1=new BMW();
		o1.engine();
		o1.companyValut();
		o1.CarFeature();
		
		
	}
   
	
}
