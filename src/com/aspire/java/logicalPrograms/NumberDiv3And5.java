package com.aspire.java.logicalPrograms;
//Number divisible by 3 and 5 from 1-100
public class NumberDiv3And5 
{
public static void main(String[] args)
  {
	for(int i=1;i<=100;i++)
	{
		if(i%3==0 && i%5==0)
		{
			System.out.println(i);
		}
	}
  }
}
