package com.aspire.java.Practis.java;
// if any query refer the you tube
public class TryCtach
{ public static void main(String[] args) 
{  int a=10;
   int b=10;
   int c=0;
   int d;
   int e;
   int j;
   
   try
   {
    d=a/c;
    System.out.println(d);
   }
   catch( java.lang.ArithmeticException f)
    {
	  System.out.println("do not divide with zero");
    }
	 e=a*b;
	 System.out.println(e);
	 
	 try
	 {
	int s[]= {1,2,3,4,5,6};
	j=s[9];
	System.out.println(j);
	 }
	
	 
    catch( java.lang.ArrayIndexOutOfBoundsException x )
      {
		System.out.println("index should less than lentgh of arrays");
      }
		
	 finally
	 {
		 System.out.println("final");
	 }
	
}
}
	

