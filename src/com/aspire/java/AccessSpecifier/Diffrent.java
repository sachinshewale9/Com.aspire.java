package com.aspire.java.AccessSpecifier;

public class Diffrent
{
  public void m9() //highest
  {
	 System.out.println("Public method from same package  from  diffretn class"); 
  }
  protected void m10()
  {
	  System.out.println("Protected method from same package  from diffrent class");
  }
  void m11()
  {
	System.out.println("Default method from same package  from diffrent class");	
  }
 private void m12()   //lowest
  {
	 System.out.println("Private method from same package from diffrent   class");
  }
 
 
 
	// all the four metho call in same class
  public static void main(String[] args) 
	{
		Diffrent d = new Diffrent();
		         d.m9();
		         d.m10();
		         d.m11();
		         d.m12();
		 
		
		         
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
