package com.lao.conditional_statement;

public class LetsHavCoffee {
	
	boolean isCupEmpty = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetsHavCoffee cofe = new LetsHavCoffee();
		
		if(cofe.isCupEmpty)
		{
			System.out.println("Fill the Coffee in Cup");
		}
		else
		{
			System.out.println("Drink the Coffee");
		}
	}

}
