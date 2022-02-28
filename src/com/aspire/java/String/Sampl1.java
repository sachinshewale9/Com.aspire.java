package com.aspire.java.String;

public class Sampl1 
{
 public static void main(String[] args) 
  {
	 String s= "SACHIN";
	 String s1= "LAXAMN";
	 String s2="SHEWALE";
	 String s3=new String("SACHIN");
	 String s4= new String("SACHIN");
	 String s5="sachin";
	 String s6="SACHIN";
	 
	 System.out.println(s==s1);// false
	 System.out.println(s==s5); // false
	 System.out.println(s==s6); // true
	 System.out.println(s3==s4);// false
	 
	 //to chack conatin
	 System.out.println(s.equals(s6)); //true
	 System.out.println(s1.equals(s2));// false
	 System.out.println(s3.equals(s4)); // true
  }
}
