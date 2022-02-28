package com.aspire.java.AccessSpecifier;

public class Parent
{
 public void m1()   //Highest access
    {
	 System.out.println("Public method from paremt class");
    }
	
 protected void m3()
    {
	System.out.println("Protected method from parent class");
	}
	
	void m2 () // Default method
	{
		System.out.println("Default method  from parent class ");
	}
	
private void m4 ()  // Lowest access
	{
		System.out.println("Private method from parent class");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
