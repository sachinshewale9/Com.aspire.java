package com.aspire.java.Opps.Casting.NonPrimitive;

public class Test
{
 public static void main(String[] args) 
    {
	 System.out.println("****PARENT PROPERTY******");
	  Parent p = new Parent();
	         p.house();
	         p.money();
	      
     System.out.println("****CHILD PROPERTY******");
       Child c = new Child();
             c.bike();
             c.house();
             c.money();
         
          System.out.println("****AFTER CASTING******");
	        Parent pc = new Child(); // Child class object refer to Parent class name
	               pc.house();       //latest implementation from child class
	               pc.money();       //latest implementation from child class
	               pc.jwellery();
	               
	       
    }
}
