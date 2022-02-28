package com.aspire.java.String;
// conatin related whether it empty or not
public class StringContent
{
 public static void main(String[] args) 
 {
  String s1= "Aspire Trainig Institute";
  String s2="aspire";
  String s3="pune";
  String s4="";
  String s5="in";
 System.out.println(s4.isEmpty());	 //true ...to checking string empty or not
 System.out.println(s3.isEmpty());   //false...to checking string empty or not
 System.out.println(s1.charAt(20));  // lenghth---->24 and index 23
 char a=s1.charAt(4);	
  System.out.println(a);
System.out.println(s1.contains(s5));//true
System.out.println(s1.contains(s2)); //false
System.out.println((s1.toLowerCase()).contains(s2));// true
System.out.println(s1.indexOf('e'));	//first match index number
System.out.println(s1.lastIndexOf('e')); //last match index number
System.out.println(s2.startsWith("Asp"));
System.out.println(s1.endsWith("te"));	 
System.out.println(s2.lastIndexOf('e'));
System.out.println(s2.length());
System.out.println(s2.lastIndexOf(""));//length of string without using lengt method
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
}
