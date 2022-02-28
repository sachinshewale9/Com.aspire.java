package com.aspire.java.oops.SingleLevelInheritance;

public class TestClass 
{
 public static void main(String[] args) 
  {
	System.out.println("*****PARENT PROPERTIES**** ");
	
	 Parent p=new Parent(); // object created by class name to call the  method 
	        p.bunglow();
	        p.car();
	        p.money();
	        p.farm();
	 
	
	
	System.out.println("*****CHILD PROPERTIES*****");
	
	Child c=new Child();//  object created by class name to call method 
          c.bike();
          c.bunglow();
          c.car();
          c.farm();
          c.iphone();
          c.money();
	
	
	
	
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
