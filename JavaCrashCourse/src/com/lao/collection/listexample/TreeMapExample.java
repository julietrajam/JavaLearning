package com.lao.collection.listexample;

import java.util.TreeMap;

public class TreeMapExample {

	public void basictreemapoperations()
	{
	
	TreeMap<String,String> placesinmadurai=new TreeMap<String,String>();
	
	placesinmadurai.put("Kalavasal","Madurai");
	placesinmadurai.put("KK Nagar","Madurai");
	placesinmadurai.put("Arapalayam","Madurai");
	placesinmadurai.put("Anna Nagar","Madurai");
	placesinmadurai.put("PP Chavadi","Madurai");
	placesinmadurai.put("Alagar kovil","Madurai");
	placesinmadurai.put("Periya Nilayam","Madurai");
	
	System.out.println("Key and values in Tree Map :"+placesinmadurai);
	
	//Duplicate keys added means then value will be overridden
	placesinmadurai.put("Kochadai","Madurai");
	placesinmadurai.put("Kocahdai","Achampathu");
	System.out.println("Key and values in Tree Map :"+placesinmadurai);
	
	//null insertion is not allowed in Tree Map since it implements Comparabale interface.It can not compare null with any value
	//placesinmadurai.put("null","abc");
	
	System.out.println("Key and values in Tree Map :"+placesinmadurai);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMapExample o1=new TreeMapExample();
		o1.basictreemapoperations();

	}

}
