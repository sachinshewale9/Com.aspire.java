package com.aspire.java.Arrays;

import java.util.Arrays;

public class PractsArr 
{
 public static void main(String[] args) 
 {
	int  []a= {1,5,6,7,2,3,4,5,6,7,8,9};
	 
	 Arrays.sort(a);
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.print(a[i]+", ");
	 }	 
	 System.out.println();                                  
	 
	 for (int j=a.length-1;j>=0;j--)
	 {
		 System.out.print(a[j]+", ");
	 }
	 
	 
	 
	 
	 
	 
	 
 } 
}
