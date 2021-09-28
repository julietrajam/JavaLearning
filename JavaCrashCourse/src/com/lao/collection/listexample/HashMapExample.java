package com.lao.collection.listexample;

import java.util.HashMap;

public class HashMapExample {
    
	public void basichashmapoperationsexample() {
		
		//Elements stored in Random Order
		
		HashMap<String,String> hmp=new HashMap<String,String>();
		hmp.put("Mommy","Jeyaseeli");
		hmp.put("Daddy","Ramasamy");
		hmp.put("Son","Sundar");
		hmp.put("Daughter","Juli");
		
		
		System.out.println("Elements in HashMap :"+hmp);
		
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(1, "Abirami");//ENTRY
		hm1.put(2, "Banu");
		hm1.put(3, "Cinthiya");
		hm1.put(4, "Dhakshu");
		hm1.put(2, "Felciya");
		
		System.out.println("Elements in HasMap1: "+hm1);
		
		
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Mommy","Juls");
		hm.put("Daddy","Seenuvas");
		hm.put("Son","Rohan");
		hm.put("null","Mini Juli");
		hm.put("null","nila");
		
		
		System.out.println("Elements in HashMap :"+hm);
		//to copy all the elements from one map to another
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		hm2.putAll(hm1);
		System.out.println("Elements in HashMap2: "+hm2);
		
		//Clear the contents in HashMap2
		hm2.clear();
		System.out.println("After clearing elements in HashMap2 :"+hm2);
		
		//To check whether the key is present in the Map or not
		System.out.println("Does this map has key 2: "+hm1.containsKey(1));
		
		//To check whether the key is present in the Map or not
		System.out.println("Does this map has Value Abirami: "+hm1.containsValue("Abirami"));
		
		//To get copy or clone of the map
		System.out.println("Clone of the Map: "+hm1.clone());
		
		//to check whehter the Map is empty or not
		System.out.println("Is this HashMap empty :"+hm1.isEmpty());
		
		//Fetch the set of Keys in the Map(Note:Here it is not list of keys.Its set of keys)
		//Because List will allow duplicate but Set wont.Keys should be unique.
		System.out.println("Keys in Map :"+hm1.keySet());
		
		//Fetch a Value
		System.out.println("Fetching value with the index 2 :"+hm1.get(2));
		
		//Fetch all values
		System.out.println("Fetching all the values in Hash Map :"+hm1.values());
		
		//EntrySet
		System.out.println("Fetching KEy and Values in HashMap :"+hm1.entrySet());
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapExample o1=new HashMapExample();
		o1.basichashmapoperationsexample();

	}

}
