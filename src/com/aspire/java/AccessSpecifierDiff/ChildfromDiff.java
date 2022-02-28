package com.aspire.java.AccessSpecifierDiff;
import com.aspire.java.AccessSpecifier.Parent;
 import com.aspire.java.AccessSpecifier.Diffrent;
public class ChildfromDiff extends Parent
{
 public static void main(String[] args) {
	
	 Parent p = new Parent();
	        p.m1(); // public method from diffrent pack with inheritance w r.t parent class object
	        
	        ChildfromDiff cdc = new ChildfromDiff();
	                      cdc.m1();// public method from diff pack with inheritace wrt child class object
	                      cdc.m3(); // fdefault method from diff pack with inheritace wrt child class object
	                      
	 Diffrent d = new   Diffrent();
	          d.m9(); // public method from diff pack class
 }
	     
 
 
}
