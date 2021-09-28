package com.lao.collection.listexample;


import java.util.Iterator;

import java.util.LinkedList;


public class LinkedListExample {


          public void linkedlistmethods()

         {

          LinkedList <Integer>l1 = new LinkedList <Integer>();

          l1.add(1);
          l1.add(2);
          l1.add(3);
          l1.add(4);
          l1.add(5);
          l1.add(6);
          l1.add(2);
          l1.add(9);
          l1.add(null);
          l1.add(null);

          System.out.println("Elements in LinkedList:"+l1);
          //Adding element first in the list
          l1.addFirst(7);
          System.out.println("Adding first element in the list:"+l1);

         //Adding element last in the list
         l1.addLast(8);
         System.out.println("Adding last element in the list:"+l1);

         //getting the first value
         System.out.println(l1.getFirst());

         //Get the first value using index
         System.out.println("First value in the list: "+l1.get(0));

         //getting the element which is in the 3rd index
         System.out.println("Retrieving the element which is in 3rd index: "+l1.get(3));


         //remove first element in the list
         System.out.println("Removing first element: "+l1.removeFirst());
         System.out.println("After removing first element :"+l1);

         //remove last element in the list
         System.out.println("Removing last element:"+l1.removeLast());
         System.out.println("After removing last element: "+l1);


//remove -deletes the first element

l1.remove();

System.out.println("After removing first element using remove:"+l1);



//Poll and pollfirst() removes the first element in the list

System.out.println(l1.poll());

System.out.println(l1);


//pollLast deleted the last element in the list

System.out.println(l1.pollLast());


//remove first occurrence

l1.removeFirstOccurrence(2);

System.out.println(l1);


//remove last occurrence

l1.removeLastOccurrence(9);

System.out.println(l1);


}



public void iteratingLinkedListwithsimplefor()

{

LinkedList <String> s1= new LinkedList<String>();

s1.add("Apple");

s1.add("Mango");

s1.add("Orange");

s1.add("Pineapple");

s1.add("Guava");


for(int i=0;i<s1.size();i++)

{

System.out.println(s1.get(i));

}


}


public void iteratingLinkedListwithadvancefor(){


LinkedList <String> s1= new LinkedList<String>();

s1.add("Innova");

s1.add("Alto");

s1.add("Maruti");

s1.add("Nexon");

s1.add("Tesla");


for(String string:s1)

{

System.out.println(string);

}


}


public void iterateUsingwhile() {


LinkedList <String> s= new LinkedList<String>();

s.add("Ladies Finger");

s.add("Brinjal");

s.add("Tomato");

s.add("Potato");

s.add("Chilly");


int number=0;

while(s.size()>number)

{

System.out.println("Elements in the list:"+s.get(number));

}


}


public void iterateUsingIterator()

{

LinkedList <String> s2= new LinkedList<String>();

s2.add("Rohan");

s2.add("Krishna");

s2.add("Juls");

s2.add("Seenu");

s2.add("Pappu");


Iterator<String> l1_iterator = s2.iterator();

while(l1_iterator.hasNext())

{

System.out.println("Elements in list displayed using iterator:"+l1_iterator.next());

}

}





public static void main(String[] args) {


LinkedListExample o1= new LinkedListExample();

o1.linkedlistmethods();

o1.iteratingLinkedListwithsimplefor();

o1.iteratingLinkedListwithadvancefor();


}


}