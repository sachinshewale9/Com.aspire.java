package com.aspire.java.String;
//imp program 
public class StringOp2
{
 public static void main(String[] args) 
 {
	 // program for .....>Aspire Training Institute Pune with split function
	String s1="Aspire Training Institute Pune";// 
	String[]  a=s1.split("") ;
	//System.out.println(a.length); // for counting character in string 
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);// for Aspire traing institute out put
	}
	 
	System.out.println();// dumy printing for take lower side statement 
	
	 //for reverse out put ....> Pune Institute Training Aspire i.e. enuP etutitsnI gniniarT eripsA
	 for(int j=a.length-1; j>=0;j--)
	 {
		 System.out.print(a[j]);
	 }
	 System.out.println();
	// program for replace method or function
		 System.out.print(s1.replace('i', 'I'));
		 System.out.println();
		 System.out.println(s1.replace("Pune","Mumbai"));
	
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
