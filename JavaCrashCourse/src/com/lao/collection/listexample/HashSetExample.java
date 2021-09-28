package com.lao.collection.listexample;

import java.util.Iterator;
import java.util.HashSet;



public class HashSetExample {

	public void basicExampleHashSet()
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add("A");
		h1.add("B");
		h1.add("C");
		h1.add("D");
		h1.add("E");
		h1.add("F");
		h1.add(null);
		h1.add(null);
		h1.add("F"); //the return type of add() is boolean since F is already there.
		
		System.out.println("Contents of HashSet:"+h1);
		
		//To remove an element from HashSet
		h1.remove(null);
		System.out.println("Contents of HashSet:"+h1);
		
		//to check whether the element is present in HashSet
		System.out.println(h1.contains("e"));
		
		//Checking whether HashSet is empty or not
		System.out.println("HashSet is empty or not:"+h1.isEmpty());
		
		HashSet <String> h2=new HashSet<String>();
		h2.addAll(h1);
		System.out.println("Elements is Hash Set2 :"+h2);
		
		//Print size of HashSet
		System.out.println("Size of HashSet:"+h2.size());
		
		
	}
	
	public void iteratorexample()
	{
		HashSet<String> s3=new HashSet<String>();
		s3.add("Washing Machine");
		s3.add("Grinder");
		s3.add("Mixer");
		s3.add("Fridge");
		
		Iterator<String> hs_iterator=s3.iterator();
		while(hs_iterator.hasNext())
		{
		System.out.println("Elements are displayed using Iterator :"+hs_iterator.next());
	   }
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetExample o1=new HashSetExample();
		o1.basicExampleHashSet();
		o1.iteratorexample();
		
	}

}
