// Technique to retrive the elemnts from object---->Foreach loop,Itertor,List iterator,Enumaration
package com.aspire.java.CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 
{
public static void main(String[] args)
 {
	ArrayList al = new ArrayList ();
	al.add("Sachin");
	al.add(1234567890);
	al.add("abc@gmail.com");
    al.add('A');
	al.add(98.5f);
    al.add(null);
    
    al.add(98.5f);
	al.add(null);
    al.add("Nagar");
    System.out.println(al);
    System.out.println(al.size());
    System.out.println(al.isEmpty());
    System.out.println(al.indexOf('A'));
    System.out.println(al.lastIndexOf("Nagar"));
    al.add(50);// to add data
    System.out.println(al);
    al.remove(98.5f); // to removes data
    System.out.println(al);
    al.remove(null);// to remove data
    System.out.println(al);
    al.set(7, 60); // to update data from 50 to 60
    System.out.println(al);
    System.out.println();
    System.out.println(al.get(6)); // to get perticuler data from list 
    System.out.println(al.get(0));  // to get perticuler data from list 
	          for (int i=0;i<al.size();i++) // for loop 
	          {
	        	  System.out.print(al.get(i)+",");
	          }
	          for(Object b:al)   // for each loop
	          {
	        	  System.out.print(b+",");
	          }
	         System.out.println();
	         System.out.println("****Iterator only in forword**********");
	         Iterator itr=al.iterator();
	       // also get data by foreach loop 
	         System.out.println("****get data by for each loop****");
	         for(Object c:al)
	         {        	System.out.print(c+",");
	         } 
	         while(itr.hasNext())
	         {
	    	 System.out.print(itr.next());
	        }
	         System.out.println();
	         System.out.println("******List iterator in forword**********");
	         ListIterator li=al.listIterator();
	         while(li.hasNext())
	         {
	        	System.out.print(li.next()+" ,"); 
	         }
	         System.out.println();
	         System.out.println("List Iterator in reverse");
	         ListIterator lirev=al.listIterator(al.size());
	         while(lirev.hasPrevious())
	         {
	        	 System.out.print(lirev.previous()+" ,");
	         }
	         // also get data by for each loop 
	         for(Object c:al)
	         {
	        	System.out.println(c);
	         }      
	
	
	
	
	
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
