package com.aspire.java.thisuperPract;

public class Child extends Parent
{
 int a=2;  // global
 int b=3;  // global 
 int j =4; // global

  public void sachin()
  {
	 int a=5;   // local 
	 int b =6;  // local 
	 int k=7;   // local 
	 
	 System.out.println("local variable a="+a);
	 System.out.println("local variable b="+b);
	 System.out.println("local varaible k="+k);
	 System.out.println("Global variable from same class="+this.a);
	 System.out.println("Global variable from same class="+this.b);
	 System.out.println("Global varaible from same class="+this.j);
	 System.out.println("Glbal varaible from parent class="+super.a);
	 System.out.println("Globalvaraible from parent class ="+super.b);
	 System.out.println("Global varaoble from parent class="+super.i);
	
	 
	 
  } 
  }