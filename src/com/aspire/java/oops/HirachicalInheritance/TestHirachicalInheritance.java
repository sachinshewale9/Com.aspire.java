package com.aspire.java.oops.HirachicalInheritance;





public class TestHirachicalInheritance 
{
	public static void main(String[] args) 
	   {
		 System.out.println("****Purchase mobile from flipkart****");
		  Child1 c1 =new Child1();
		                  c1.openBrowser();
		                  c1.openFlipkart();
		                  c1.enterCredentials();
		                  c1.MobileShoping();
		                  c1.payments();
		 
		 System.out.println("****Purchase Laptop from flipkart****");
		 Child2 c2 =new Child2();
		                  c2.openBrowser();
		                  c2.openFlipkart();
		                  c2.enterCredentials();
		                  c2.LaptopShoping();
		                  c2.payments();
		        
		  System.out.println("****Purchase DSLR camera from flipkart****");  
		  Child3 c3 = new Child3();
		                   c3.openBrowser();
		                   c3.openFlipkart();
		                   c3.enterCredentials();
		                   c3.DSLRShoping();
		                   c3.payments();
		 
	   }
	
}
