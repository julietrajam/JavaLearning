package com.lao.stringexamples;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="  Juliet  ";
		int number=2;
		
		//returns character value for the particular index
		System.out.println(name.charAt(2));
		
		//returns String length
		System.out.println(name.length());
		
		//checks the equality of string with the given object
		System.out.println(name.equals("Seenu"));
		
		//checks the equality of string with the given string object by ignoring case sensitivity
		System.out.println(name.equalsIgnoreCase("juliet"));
		
		//check if string is empty or not
		System.out.println(name.isEmpty());
		
		//returns true or false based on the given value is present or not
		System.out.println(name.contains("s"));
		
		//take a particular portion of a string
		System.out.println(name.substring(2));
		
		//take a particular portion of a string begin and end index
		System.out.println(name.substring(2, 4));
		
		//appends the string to the given string
		System.out.println(name.concat("Rajam"));
		
		//replaces the existing char with the given char
		System.out.println(name.replace('e', 'a'));
		System.out.println(name.replace("Juliet", "Juls"));
		
		//find the position of a character in the String
		System.out.println(name.indexOf("J"));
		
		//find the character specified from the index position
		System.out.println(name.indexOf("e", 3));
		
		System.out.println(name.indexOf("liet", 0));
		
		//Trim will remove the white spaces before and after
		System.out.println(name.trim());
		
		//Convert the given datatype to String
		System.out.println(String.valueOf(number));
		
		String lower="julietrajam";
		System.out.println(lower.toUpperCase());
		
		String upper="JULIETRAJAM";
		System.out.println(upper.toLowerCase());
		
		//Returns a Joined String with Given delimiter
		System.out.println(String.join("-","Learn","Automation","Online"));
		System.out.println(String.join("/", "14","11","1991"));
		
		
	   //Split
		String splitSentence="Hi,This,is,Juliet";
		String [] splitwords=splitSentence.split(",");
		for(String spl:splitwords)
		{
			System.out.println(spl);
		}
		
		
		
		

	}

}
