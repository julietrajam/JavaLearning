 package com.lao.javaLearning;

public class CollectAmount {
    
	public Integer collectedAmount=2000;
	
	public Integer collectAmountandGiveItToMe()
	{ 
		System.out.println("Daddy have collected amount:" +collectedAmount);
		return collectedAmount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectAmount myson=new CollectAmount();
		Integer amount=myson.collectAmountandGiveItToMe();
		System.out.println("Got the amount sent by you:"+amount);

	}

}
