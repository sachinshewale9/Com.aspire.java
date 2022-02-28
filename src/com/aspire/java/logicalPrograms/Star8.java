package com.aspire.java.logicalPrograms; 
//program for out put of as follow
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *
// Rows=6,columns=6,space=5
public class Star8 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=6;i++)
		{
		 for (int space=5; space>=i; space--)
		 {
			 System.out.print(" ");
		 }
		 for (int j=1; j<=i; j++)
		 {
			 System.out.print("*"+" ");
		 }
		 System.out.println();
		}
	}
}
