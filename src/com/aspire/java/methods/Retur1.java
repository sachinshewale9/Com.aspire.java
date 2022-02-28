package com.aspire.java.methods;

public class Retur1 
{
public static void main(String[] args) 
  {
	// System.out.println(  returne ());   another approach
	int i=returne();
	System.out.println(i);
	String k= returne1();
	System.out.println(k);
  }


public static int returne ()
  {
	int a=10;
	int b=20;
	int c=a+b;
	return c;

  }
public static String returne1()
   {
	
    String d="hello";
    return d;

	}
}
