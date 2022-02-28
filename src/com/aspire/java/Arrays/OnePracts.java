package com.aspire.java.Arrays;

import java.util.Arrays;

public class OnePracts
{
 public static void main(String[] arg) 
 {
	
	 int  []a= {77,45,88,32,93};
	 int  []b= {90,11,85,06,60,};
	 
	int sum =a[4]+b[3];
	 System.out.println("sum of a[4]+b[2]"+sum);
	 Arrays.sort(a);
	 for(int i=0;i<a.length;i++)
	 {
		System.out.print(a[i]+", "); 
	 }
	 System.out.println();
	 for(int i=a.length-1;i>=0;i--)
	 {
		System.out.print(a[i]+" ,"); 
	 }
	 
	 
	 
	 
 }

	
	
	
	
}
