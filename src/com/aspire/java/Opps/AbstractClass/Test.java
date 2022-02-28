package com.aspire.java.Opps.AbstractClass;

public class Test 
{
 public static void main(String[] args) 
 {
	System.out.println("Abstarct method from parent implemantion from child1");
	 
	  Child1 c1 = new Child1();
	         c1.OpenBroweser();
	         c1.entertheurl();
	         c1.EntrUsn();
	         c1.EntPwd();
	         c1.clickSignInbtn();
	         c1.ShopAtm();
	         c1.logout();
	          
	   System.out.println("Abstract metho from parent implimentation from child2");      
	   Child2 c2 = new Child2();
	          c2.OpenBroweser();
	          c2.entertheurl();
	          c2.EntrUsn();
	          c2.EntPwd();
	          c2.clickSignInbtn();
	          c2.ShopAtm();
	          c2.logout();
	  System.out.println("Abstarct method from parent implemantation from child3");        
	  Child3  c3 = new Child3 ();
	          c3.entertheurl();
	          c3.EntrUsn();
	          c3.EntPwd();
	          c3.clickSignInbtn();
	          c3.ShopAtm();
	          c3.logout();
	         
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
