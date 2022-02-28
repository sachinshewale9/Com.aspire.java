package com.aspire.java.PolymorphismPractiMethodOverloading;

public class Method_Overloading
{
public static void addition(int a)
 {
	System.out.println("zero parameter");
 }
public static void addition(int c, int d)
 {
	int e=c-d;
	System.out.println(e);

 }
public static void addition(int f, int g, int h)
{
	int j=f+g+h;
	System.out.println(j);
}
public static void main(String[] args)
{
	 Method_Overloading.addition(1);
	 Method_Overloading.addition(2, 4);
	 Method_Overloading.addition(4, 5, 9);

	
	
	
	
}	
	
	
	
	
		
	
	
}
