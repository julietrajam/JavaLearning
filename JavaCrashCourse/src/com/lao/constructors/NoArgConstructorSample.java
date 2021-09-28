package com.lao.constructors;

public class NoArgConstructorSample {
	
	String Employee_Name;
	Integer Employee_ID;
	
	NoArgConstructorSample(){
		Employee_Name="Juliet";
		Employee_ID=20180664;
		System.out.println("Employee_Name is "+Employee_Name);
		System.out.println("Employee_ID is "+Employee_ID);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgConstructorSample o1 = new NoArgConstructorSample();
		
	}

}
