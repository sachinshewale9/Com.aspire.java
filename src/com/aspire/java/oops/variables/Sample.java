package com.aspire.java.oops.variables;
// static varaible are not come in the static method
public class Sample
{
    int a=20;  // inside the class and out side method called a Globl variable
    String s= "ATI PUNE";
	static int i=100; // Static Global variable
 public void Addition()
   {
	 int b=50;   // inside the method block called Local varaible
	 int c= a+b; //Local variable
	 System.out.println(c);
	 System.out.println(s);
   }
 public void multi()
   {
	 int d=70;  // local variable
	 int e=a*d; // Local varaible
	 System.out.println(e);
	 System.out.println(s);
	 
   }
 public static void substraction()
   {
	  int j=30;
	  int k= i-j;
	 System.out.println(k);
	// System.out.println(s);// s is non static
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
}
