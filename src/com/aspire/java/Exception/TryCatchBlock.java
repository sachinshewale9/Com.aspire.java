package com.aspire.java.Exception;

public class TryCatchBlock 
{
 public static void main(String[] args) 
 {
	int a=10;
	int b=0;
	int div;
	int sum;
	try
	{
		div=a/b;
		System.out.println(div);
	}
	 catch(ArithmeticException  e)
	 {
		 System.out.println("do not divide with zero");
	 }
	// sum= a+b;
	//System.out.println(sum);
	//String s="Aspire Training Institute";
	//try
	//{
//	System.out.println(s.charAt(30));
//	}
//	catch(StringIndexOutOfBoundsException e)
	//{
		System.out.println("Please take index in string less than length of string");
	//}
	 	 	 
 }	
	
	
}
