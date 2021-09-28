package com.lao.staticexamples;

public class StaticVariables {

	static int accountBalance=0;
	String depositedBy;
	
	public static void main(String[] args) {
	
		StaticVariables o1 = new StaticVariables();
		
		System.out.println("Account Balance:"+accountBalance);
		
		o1.accountBalance=100;
		o1.depositedBy = "Juliet";
		
		StaticVariables o2 = new StaticVariables();
		o2.accountBalance=500;
		o2.depositedBy = "Seenu";
		
		System.out.println("Account Balance:" +o1.accountBalance);
		System.out.println("Deposited by:" +o1.depositedBy);
		
		System.out.println("Account Balance:" +o2.accountBalance);
		System.out.println("Deposited by:" +o2.depositedBy);
		
		

	}

}
