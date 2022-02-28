package com.aspire.java.Arrays;

import java.util.Arrays;

public class OneDiam 
{
  public static void main(String[] args)
  {
	int []a= {1,2,3,4,5,6,7,8,9,10,}; // Size=Lenghth=count of that array elements
	int []b= {11,12,13,};
	int []c= {14,15,16,17,18,};
	char []d= {'A','B','C','D',};
	String []e= {"A","10.5","Institute","Pune"};  
	  
	  System.out.println("length of a="+a.length); // to find the length of 'a'elemnt
	  System.out.println("Length of b="+b.length); // to find the length of 'b'elemnt
	  
	//  Anothwer method to wright aaray as follow but we have mention first array size 
	  
	  int []i=new int[7];
	  i[0]=5;
	  i[1]=6;
	  i[2]=7;
	  i[3]=8;
	  i[4]=9;
	  i[5]=10;
	  i[6]=11;
	int sum=a[8]+b[2]; //9 & 13
	 System.out.println("sum a[8]+b[2]="+sum); 
     System.out.println("Length of i[]="+i.length);
	  System.out.println("Elemt of 3rd index in a[]="+a[3]);
	 for (int k=0;k<a.length;k++)// for this out put = 1,2,3,4,5,6,7,8,9,10
	 {
		
	  System.out.print(a[k]+",");
		 
	 }
	 System.out.println();
	 for (int j=0;j<b.length;j++)// for this out put = 11,12,13
		 
	 {
	
		 System.out.print(b[j]+" , ");
	 }
	 System.out.println();
	 int  []f= {12,5,18,35,45,2,984,5,64,4556};
	 System.out.println("****** Forword sorting***** f[]");
	 Arrays.sort(f);
	 for(int l=0;l<f.length;l++)
	 {
		 System.out.print(f[l]+" ");
	 }

	 System.out.println();
	 
	 System.out.print("*****Reverse sorting***** ");
	 System.out.println();
	
	 for(int m=f.length-1;m>=0; m--)
	 {
		
		 System.out.print(f[m]+" ");
	 }
  }
}
