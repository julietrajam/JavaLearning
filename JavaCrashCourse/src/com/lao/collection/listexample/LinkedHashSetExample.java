package com.lao.collection.listexample;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public void basicHashSetExample()
	{
        HashSet <String> lh1=new LinkedHashSet<String>();
        lh1.add("Pept");
        lh1.add("Vespa");
        lh1.add("Ray");
        lh1.add("Access");
        lh1.add("Active");
        lh1.add("Pep+");
        lh1.add(null);
        lh1.add(null);
        System.out.println("Elements in Linked Hash Set :"+lh1);
         
        lh1.remove("Pept");
        System.out.println("After removing an element in Linked Hash Set :"+lh1);
        
        System.out.println("Size of Linked Hash Set :"+lh1.size());
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSetExample o1= new LinkedHashSetExample();
		o1.basicHashSetExample();

	}

}
