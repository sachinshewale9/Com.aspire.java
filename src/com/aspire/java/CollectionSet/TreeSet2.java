package com.aspire.java.CollectionSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 
{
 public static void main(String[] args)
 {
	TreeSet ts2 = new TreeSet();
	ts2.add("Ajinkya");
	ts2.add("Heena");
	ts2.add("Priyanka");
	ts2.add("Sachin");
	ts2.add("Jayshri");
	ts2.add("Akansha");
	ts2.add("Vaibhav");
	ts2.add("Niklesh");
	ts2.add("Vaibhav");
	System.out.println(ts2); // Dublicate not allowed
	System.out.println(ts2.size());
	System.out.println(ts2.isEmpty());// false
	System.out.println(ts2.contains("Punam")); 
	System.out.println("Data with Foreach");
	for(Object a:ts2)
	{
		System.out.print(a+", ");
	}
	System.out.println("Dat with Iterator"); 
	Iterator itr =ts2.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+",");
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}
