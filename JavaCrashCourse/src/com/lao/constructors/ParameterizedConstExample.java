package com.lao.constructors;

public class ParameterizedConstExample {
    
	String Animal_name;
	String Animal_type;
	
	ParameterizedConstExample(String name,String type)
	{
		Animal_name = name;
		Animal_type = type;
	}
	
	public void aboutAnimal()
	{
		System.out.println("Animal name is " +Animal_name);
		System.out.println("Animal_type is " +Animal_type);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstExample o1 = new ParameterizedConstExample("Cat" , "Omnivores");
		o1.aboutAnimal();
		
		ParameterizedConstExample o2 = new ParameterizedConstExample("Duck" , "Omnivores");
		o2.aboutAnimal();

	}

}
