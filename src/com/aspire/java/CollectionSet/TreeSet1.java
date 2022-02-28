package com.aspire.java.CollectionSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1
{
 public static void main(String[] args) 
 {
	TreeSet ts1= new TreeSet();
	        ts1.add(1);
	        ts1.add(12);
	        ts1.add(7);
			ts1.add(10);
			ts1.add(4);
			ts1.add(7);
			ts1.add(1);
			ts1.add(9);
	 System.out.println(ts1); // dublicate not allowed and inserion assending order
	 System.out.println(ts1.size());
     System.out.println(ts1.isEmpty());// false
     System.out.println(ts1.contains(11));// false
	 System.out.println("Data with foreach");
	 for(Object a:ts1)
	 {
		 System.out.print(a+", ");
	 }
	 System.out.println();
	 System.out.println("Data with Iterator");
	 Iterator itr= ts1.iterator();
	 while(itr.hasNext())
	 {
		 System.out.print(itr.next()+", ");
	 }
	 
	 
	 
	 
	 
	 
	 
 }

private static void Iterator() {
	// TODO Auto-generated method stub
	
}
}
