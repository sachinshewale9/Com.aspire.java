package com.aspire.java.CollectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 
{
 public static void main(String[] args) 
 {
	 HashSet hs = new HashSet();
	 System.out.println(hs.isEmpty()); // true
	 hs.add("Ajinkya");
	 hs.add(47.25);
	 hs.add(123456789);
	 hs.add("Abc@gmail.com");
	 hs.add('A');
	 hs.add(98.5f);
	 hs.add(null);
	 hs.add(98.5f);
	 hs.add(null);
	 hs.add("Nagar");
	 hs.add("Ajinkya");
	 System.out.println(hs);// in Hashset Dublicate not allowed
	 System.out.println(hs.size());// size of hashSet
	 System.out.println(hs.isEmpty());
	 hs.remove(98.5f);
	 System.out.println(hs);
//	 for(int i=0;i<hs.size();i++)
// {
//		 System.out.println(hs.get); // no get method in Hashset for forloop
//	 }
//	
	 System.out.println();
	 System.out.println("*****Data with for each loop******");
	 for(Object a:hs)
	 {
		 System.out.println(a+",");
	 }
	 System.out.println("Get the data or out put by Iterator");
	 Iterator itr = hs. iterator();
	 while(itr.hasNext())
	 {
		 System.out.print(itr.next());
	 }
	 
	 		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 


	

 }

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

