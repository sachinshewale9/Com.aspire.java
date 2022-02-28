package com.aspire.java.thisuper;

public class Child extends Parent
{
  int a=100;    // Global non static variable
  int b=200;   // Global non static variable
  int j=300;  // Global non static variable
   public void addition()
   {
	   int a=10;  // Local non static variable
	   int b=20;  // Local non static variable
	   int k=40;  // Local non static variable
	   
	    System.out.println("Local Variable a = "+a);
		System.out.println("Local Variable b = "+b);
		System.out.println("Local Variable a+b = "+(a+b));
		System.out.println("Global from same class a = "+this.a);
		System.out.println("Global from same class b = "+this.b);
		System.out.println("Global from Parent class a = "+super.a);
		System.out.println("Global from Parent class b = "+super.b);

		int c=super.a+this.b+b;
		System.out.println(c);

		System.out.println("Global from parent class i="+i);
		System.out.println("Global from same class j="+j);
		System.out.println("Local varibale k="+k);

	}

	//Local variables from child class are not available to any other methods
 
	   
   }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

