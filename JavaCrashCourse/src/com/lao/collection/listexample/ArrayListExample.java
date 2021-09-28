package com.lao.collection.listexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ArrayListExample {
	
	public void arraylistoperationsexample() {
		
		List <String> list1 = new ArrayList<String>();
		list1.add("Juliet");
		list1.add("Seenu");
		list1.add("Rohan");
		list1.add("Juls");
		list1.add("Juliet");
		list1.add("Seenu");
		list1.add("Krishna");
		list1.add(null);  
		list1.add(null);
		
		System.out.println(list1);
		
		//Functions of ArrayList
		System.out.println(list1.get(2));
		System.out.println(list1.indexOf("Juliet"));
		System.out.println(list1.lastIndexOf("Juliet"));
		
		//Remove the particular element via index
		System.out.println(list1.remove(4));
		
		//Remove the particular element by its value
		System.out.println(list1.remove("Juls"));
		
		//to check whether the given list is empty or not
		System.out.println("Checking whether the given element is empty");
		System.out.println(list1.isEmpty());
		
		//Iterating a list using for each loop
		System.out.println("Using for each loop");
		for(String string:list1)
		{
		System.out.println(string);
		}
		
		//Iterating a list using normal for loop
		System.out.println("Using normal for loop");
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		//Using List Iterator
		System.out.println("Using List Iterator-Forward Traversing");
		ListIterator<String> li_iterator=list1.listIterator();
		while(li_iterator.hasNext())
		{
			System.out.println(li_iterator.next());
		}
		
		
		System.out.println("Using List Iterator-Reverse Traversing");
		while(li_iterator.hasPrevious())
		{
			System.out.println(li_iterator.previous());
		}
		
		
		//Forward traversing only applicable while using Iterator
		System.out.println("Using only itertor");
		Iterator <String> iterator=list1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		//Creating duplicate list
		List <String> list2 = new ArrayList<String>();
		list2.addAll(list1);
		System.out.println("Elements in list2:"+list2);
		System.out.println(list2.set(6, "Pappu"));
		System.out.println("Elements in list2 afer updating new value:"+list2);
		
		//to remove elements in a list
		//list2.clear();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListExample o1= new ArrayListExample();
		o1.arraylistoperationsexample();

	}

}
