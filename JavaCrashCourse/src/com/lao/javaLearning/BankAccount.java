package com.lao.javaLearning;

public class BankAccount {
	
	long AccountNumber;
	String Accountholdername;
	Integer AccountBalance=500;
	
	public void getBalance()
	{
		System.out.println("Account Balance is:" +AccountBalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount b1 = new BankAccount();
        b1.getBalance();
        
	}

}
