package com.aspire.java.PolymorphismMethodOverloading;
// not required int a=10 global varaible
public class Overloading
{
 
	int a=10;
	public void addition()
	{
	int b=20;
	int c=a+b;
	System.out.println("Addition method with no mparameter="+c);
	}
	public void addtion(int d ) 
	
	{
	 int e=a+d;	
	 System.out.println("Addition method with 1 int parameter="+e);
	}
	public void addition(int f, int g)
	{
		int h=a+f+g;
		System.out.println("Addition method with 2 int parameter="+h);
	}
	public void additon(String s)
	{
		System.out.println("Addition method with 1 String Parameter");
	}
	public void addition(float i, int j)
	{
		double k=a+i+j;
		System.out.println("Addition method with 1 float and 1 int="+k);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
