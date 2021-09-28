package com.lao.collection.listexample;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	
	public void basiclinkedhashmapexample()
	{
		LinkedHashMap<String,String> lhm1=new LinkedHashMap<String,String>();
		lhm1.put("Mommy","Jeyaseeli");
		lhm1.put("Daddy","Ramasamy");
		lhm1.put("Son","Sundar");
		lhm1.put("Daughter","Juli");
		lhm1.put("null","Mini Juli");
		lhm1.put("null","Juls");
		
		
		System.out.println("Elements in LinkedHashMap :"+lhm1);
		
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Mommy","Jeyaseeli");
		hm.put("Daddy","Ramasamy");
		hm.put("Son","Sundar");
		hm.put("Daughter","Juli");
		
		System.out.println("Elements in HashMap :"+hm);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMapExample o1=new LinkedHashMapExample();
		o1.basiclinkedhashmapexample();

	}

}
