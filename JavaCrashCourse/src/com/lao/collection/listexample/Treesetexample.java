package com.lao.collection.listexample;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetexample {
	
	
	public void basictreesetexample()
	{
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.add(1);
		ts1.add(2);
		ts1.add(3);
		ts1.add(4);
		ts1.add(5);
		ts1.add(6);
		//null pointer exception if u add thhis line ts1.add(null);
		
		System.out.println("Elements are stored in Ascending order :"+ts1);
		
		//First Element
		System.out.println("First element in the TreeSet :"+ts1.first());
		
		//Last Element
		System.out.println("Last element in the TreeSet :"+ts1.last());
		
		//Retrieve the value which is lesser than the given value
		System.out.println("Values lesser than given value:"+ts1.headSet(3));
		
		//Retrieve the value which is higher than the given value
		System.out.println("Values higher than given value:"+ts1.headSet(4));
				
		//Subset
		System.out.println("Values between the given the range: "+ts1.subSet(3, 5));
		
		//Comparator()
		System.out.println("Comparator returns null if the sorting is default natural order :"+ts1.comparator());
		
		//retrieve the higher element which is next immediate to the element specified 
		System.out.println("Higher: "+ts1.higher(4));
		
		
		//retrieve the lower element which is next immediate to the element specified 
		System.out.println("Lower: "+ts1.lower(4));
		
		//retrieve the first element and deletes from the set
		System.out.println("First Element: "+ts1.pollFirst());
		System.out.println("Element in the treeset after the deletion of first element :"+ts1.pollFirst());
		
		//retrieve the last element and deletes from the set
		System.out.println("Last Element: "+ts1.pollLast());
		System.out.println("Element in the treeset after the deletion of last element :"+ts1.pollLast());
		
		//Desending Set
		System.out.println("Treeset in desending order: "+ts1.descendingSet());
		
		//Iterating the elements in treeset
		Iterator<Integer> iterator=ts1.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Elemens in treeset displayed using iterator in Ascending order: "+iterator.next());
		}
		
		//DesendingIterator
		Iterator<Integer> desiterator=ts1.descendingIterator();
		while(desiterator.hasNext())
		{
			System.out.println("Elemens in treeset displayed using iterator in descending order: "+desiterator.next());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treesetexample o1=new Treesetexample();
		o1.basictreesetexample();
	}

}
