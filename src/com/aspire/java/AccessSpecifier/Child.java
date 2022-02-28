package com.aspire.java.AccessSpecifier;

public class Child extends Parent
{
  public void m5()
  {
	  System.out.println("public method from child class");
  }
  protected void m6()
  {
	  System.out.println("protected method from child class");
  }
  void m7()
  {
	  System.out.println("Default method from child class");
  }
  private void m8()
  {
	System.out.println("Private method from child class"); 
  }
	 public static void main(String[] args) 
	 {
		 Child c = new Child ();
		       c.m1();
		       c.m2();
		       c.m3(); // m4 can not called because of Private specifier
		       c.m5();
		       c.m6();
		       c.m7();
		       c.m8();
		 
		 Parent p =new Parent();
		        p.m1();
		        p.m2();
		        p.m3();// m4 can not called because of Private specifier
		 
		 
		 Diffrent d = new  Diffrent();
		          d.m10();
		          d.m11();
		          d.m9();
		 
		 
      }
	 
	
	
	
	
	
	
	
	
}
