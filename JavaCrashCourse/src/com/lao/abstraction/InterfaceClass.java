package com.lao.abstraction;

public class InterfaceClass implements InterfaceExample{
	
	@Override
	public void EmployeeNameDisplay() {
		// TODO Auto-generated method stub
		System.out.println("Employee Name: Seenuvas");
	}

	@Override
	public void EmployeeIDDisplay() {
		System.out.println("Employee ID is com452323");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass o1=new InterfaceClass();
		o1.EmployeeNameDisplay();
		o1.EmployeeIDDisplay();

	}

}
