package com.aspire.java.PracticeMethod1;

import com.aspire.java.DiffePAck.Manda;

public class SameClass 
{
	
	public static void Sachin()
	
	{
		System.out.println("Sachin from same class");
	}
	
	public static void KAruna()
	{
		System.out.println("karuna from same class");
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		 System.out.println("from same method");
		Sachin();
		KAruna();
		
		System.out.println("from diffrenr class");
		
		Diffrent.Kishor();
		Diffrent.Ujjawala();
		
		System.out.println("from pack");
		Manda.MotherLaw();
		
	}

}
