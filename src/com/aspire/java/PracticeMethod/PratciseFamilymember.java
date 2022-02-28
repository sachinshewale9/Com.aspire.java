
package com.aspire.java.PracticeMethod;

import com.aspire.java.PracticePackageStatic.PractisFriendsBest;

public class PratciseFamilymember 
{
public static void main(String[] args) 
   {
	System.out.println("Program start from static method");
	
	//call From same class
	
	 Father(); // from same class.====> just type method name();
	 mother(); // from same class ====> just type method name();
	 brother(); //from same class ====> just type method name();
	
	//call From Different class
	
	 PractiseRelativemember.Mama(); // from different class ===> just type class name and dot
	 PractiseRelativemember.mami(); // from different class ===> just type class name and dot
	 PractiseRelativemember.kaka(); // from different class ===> just type class name and dot
	
	//call from different package
	
	 PractisFriendsBest.Rohan(); // from different package===> just type class name and dot
	 PractisFriendsBest.Ajay();  // from different package===> just type class name and dot
	 PractisFriendsBest.Somannath(); // from different package===> just type class name and dot
	

	 System.out.println("program end fron static method");
     }
	 public static void  Father()
	 {
		System.out.println("my father nameis Laxman");
	 }
	 public static void mother()
	 {
		System.out.println("my mother name is Shakuntala");
	 }
	
	 public static void brother()
	 {
		System.out.println("my brother name is Kishor ");
	 }
	
	
	
}
