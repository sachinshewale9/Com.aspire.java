package com.aspire.java.Practis.java;

public class Arrays
{
 public static void main(String[] args)
 {
	int  []a= {1,2,3,4,5,6,7,8};
	int  []b= {77,45,88,32,93};
	int sum =a[5]+b[3];
	System.out.println("sum ofa[5]+b[3]="+sum);
	System.out.println(a.length);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+",");
	}	 
	System.out.println("forword sorting arrays");
	int  []g= {12,45,78,93,92,44};
	Arrays.sort(a);
	for(int j=0;j<g.length;j++)
	{
		System.out.print(g[j]+",");
	}
	System.out.println();
	Arrays.sort(b);
	for(int k=0;k<b.length;k++)
	{
		System.out.print(b[k]);
	}
	System.out.println();
	System.out.println("Reverse sorting");
	Arrays.sort(a);
	for(int s=a.length-1;s>=0;s--)
	{
		System.out.print(a[s]+",");
	}
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }

private static void sort(int[] g) {
	// TODO Auto-generated method stub
	
}
	
	
	
	
	
	
	
	
	
	
	
}
