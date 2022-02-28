package com.aspire.java.CollectionList;



import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 
{
 public static void main(String[] args) 
  {
	Vector v = new Vector(); 
	v.add("Ajinkya");
	v.add(1234567890);
	v.add("Abc@gmail.com");
	v.add('A');
	v.add(98.5f);
	v.add(null);
	v.add("Ngar");
System.out.println(v);
System.out.println(v.size());
System.err.println(v.isEmpty());
System.out.println(v.indexOf('A'));
System.out.println(v.lastIndexOf(98.5f));
v.add(50);
System.out.println(v);
v.remove("Abc@gmail.com");
System.out.println(v);
v.set(3, 99.5f);
System.out.println(v);
v.remove(5);
System.out.println(v);
System.out.println("For loop"); // also we get out put by for loop
for(int i=0;i<v.size();i++)
{
	System.out.print(v.get(i)+(","));
}
System.out.println();
System.out.println("Foreach loop"); // also out put get by foreach loop

for(Object b:v)
{
	System.out.print(b+",");
	
}
System.out.println();
System.out.print(" itretor in forword"); //only forword direction
Iterator itr=v.iterator();
while(itr.hasNext())
 {
	 System.out.print(itr.next()+", ");
	 System.out.println();
 }

System.out.println("Listiterator in forword dirction");
System.out.println();

ListIterator lis =v.listIterator();
while(lis.hasNext())
 {
	System.out.print(lis.next()+","); // forword direction
 }
System.out.println();
 System.out.println("Listiterator in Reverse direction");	 
	 while(lis.hasPrevious())
	 {
		 System.out.print(lis.previous()+",");
	 }
	 System.out.println();
	 System.out.println("Enumeration....>");
	Enumeration en= v.elements();
	while(en.hasMoreElements())
	{
		System.out.print(en.nextElement()+",");
	}
  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}
