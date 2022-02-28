package com.aspire.java.CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;




public class Arry 
{
public static void main(String[] args)
{
	ArrayList al= new ArrayList();
	al.add("sachin");
	al.add(123456789);
	al.add("abc@gmail.com");
	al.add('A');
	al.add(98.5f);
	al.add(null);
	System.out.println(al);
	System.out.println(al.size());
	al.remove(98.5f);
	System.out.println(al);
al.add(50);
System.out.println(al);
al.set(5, 90l);
System.out.println(al);
System.out.println(al.get(5));
for(int i=0;i<al.size();i++)
{
	System.out.print(al.get(i)+",");
}
System.out.println();
for(Object b:al)
 {
	System.out.print(b+",");
 }
System.out.println("Iterator only in forword");
Iterator itr = al.iterator();
System.out.println("***get data by while loop***");
while(itr.hasNext())
 {
	System.out.print(itr.next());
	}
// also get data by foreach loop 
System.out.println();
System.out.println("****get data by for each loop****");
for(Object c:al)
 {
	System.out.print(c);
 }
System.out.println();
 System.out.println("******ListIterator*****");	
	ListIterator lis =al.listIterator();
	while(lis.hasNext())
	{
		System.out.print(lis.next()+",");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
