package com.lao.stringexamples;

public class StringBufferExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String is IMMUTABLE");
		String name="Juliet";
		System.out.println("Original Name:"+name);
		System.out.println("Appending name to original String:" +name.concat("Rajam"));
		System.out.println("Original name:"+name);
		
		System.out.println("**************************************");
		System.out.println("StringBuffer is MUTABLE");
		StringBuffer name1=new StringBuffer("Rohan");
		System.out.println("Appending name to Orginal String Buffer:"+name1.append("Krishna"));
		System.out.println("Original name:"+name1);
		
		//StringBuffer Methods
		System.out.println("Reversed name" +name1.reverse());
		
		//Replace
		StringBuffer replaceThis=new StringBuffer("Juliet");
		System.out.println(replaceThis.replace(0, 5, "Rajam"));
		
		//Delete
		StringBuffer delete=new StringBuffer("abcdef");
		System.out.println(delete.delete(0, 2));
		
		//Insert
		StringBuffer insert=new StringBuffer("Seenu");
		System.out.println(insert.insert(4, "vas"));
		
		//Capacity
		System.out.println(insert.capacity());
		//Like String we have charAt,substring,length methods as well
		
		
		

	}

}
