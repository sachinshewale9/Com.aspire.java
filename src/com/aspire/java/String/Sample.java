package com.aspire.java.String;

public class Sample 
{
 public static void main(String[] args) 
 {
	String s="atipune";
	String s1="Aspire"; // S1 and S2 are same object and same value and it store in memory
	String s2="Aspire";
	String s3 =new String("Aspire");
	String s4 =new String("Aspire");
	String s5="aspire";
	String s6= new String("aspire");
	 
//	 // to check Object by == comparing object
//	System.out.println(s1==s2); // true
//	System.out.println(s1==s3); // false
//	System.out.println(s1==s4); // false  //== object
//	System.out.println(s1==s5); // flase
//	System.out.println(s1==s6); // false
//	System.out.println(s1==s);  // false
//	System.out.println(s2==s5); // false
//	System.out.println(s==s1);  // false
//	System.out.println(s2==s3); // false // because it take diffrent memory for storing... new key come directky say false
//	System.out.println(s3==s4); // false
	
	 // to check contents
	System.out.println(s1.equals(s2)); // true// to checking value or contents like Aspire,aspire
	System.out.println(s1.equals(s2)); // true
	System.out.println(s1.equals(s3)); // true
	System.out.println(s1.equals(s4)); // true
    System.out.println(s1.equals(s5)); // false
	System.out.println(s3.equals(s6)); // false
	System.out.println(s1.equals(s6)); // false
	System.out.println(s5.equals(s6)); // true 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
