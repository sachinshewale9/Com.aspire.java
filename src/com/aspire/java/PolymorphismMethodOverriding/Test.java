package com.aspire.java.PolymorphismMethodOverriding;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("*****PArent Properties*****");
		Parent p = new Parent();
			   p.Bunglow();
		       p.car(); // unique properties from parent
		       p.farm();
		       p.money();
		     Parent.Jwellary();  
		System.out.println("******Child Properties******");
		
		Child c = new Child();
		      c.Bike(); // unique Properties from child
		      c.Bunglow();
		      c.car();  // unique properties from parent
		      c.money();
		      
		Child.Jwellary();
	}
	

} 
