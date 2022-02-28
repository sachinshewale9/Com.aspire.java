package com.aspire.java.Assn.nonstatic;

import com.aspire.java.DifferentNonPack.NonFriends;

public class NonStaticFamily 
{
public static void main(String[] args) 
{
	System.out.println("Program start");
	
	
	NonStaticFamily object = new NonStaticFamily();
	object.method1();        // from  same class
	
	NonStaticRelativeMember nonobject = new NonStaticRelativeMember();
	nonobject.method2();     //from different class
	
	NonFriends nnobject = new NonFriends();  // from different package
	nnobject.method3();
	
	
	
	System.out.println("Program End");
	
	
}
public void method1()
{
	System.out.println("my family member from same class=Aai,Aanna,Bappa");
	}
}