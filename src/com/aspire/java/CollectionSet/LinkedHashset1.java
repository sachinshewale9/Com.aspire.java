package com.aspire.java.CollectionSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset1 
{
 public static void main(String[] args) 
 {
	LinkedHashSet lhs=new LinkedHashSet();
	System.out.println(lhs.isEmpty());// true
	  lhs.add("Ajinkya");
	  lhs.add(47.25);
	  lhs.add(1234567890);
	  lhs.add("Abc@gmail.com");
	  lhs.add('A');
	  lhs.add(98.5f);
	  lhs.add(null);
	  lhs.add(98.5f);
	  lhs.add("Ngar");
	  lhs.add("Ajinkya");
	  System.out.println(lhs);// duplication not allowed in LinkedHashset
	  System.out.println(lhs.size());
	  System.out.println(lhs.isEmpty());// false
	  lhs.remove(98.5);
	  System.out.println(lhs);
	  System.out.println("Data with foreach");
	  for(Object a:lhs)
	  {
		 System.out.print(a+", ");
	  }
	  System.out.println();
	  System.out.println("Data with Iterator");
	  Iterator itr=lhs.iterator();
	  while(itr.hasNext())
	  {
		System.out.print(itr.next()+", ");
	  }
 	  System.out.println();
	
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}
