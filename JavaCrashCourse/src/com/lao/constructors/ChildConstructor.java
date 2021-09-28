package com.lao.constructors;

public class ChildConstructor extends ParentConstructor{

	public ChildConstructor()
	{
		super();
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildConstructor o1 = new ChildConstructor();
	}

}
