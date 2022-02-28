package com.aspire.java.methods;

import com.aspire.java.DifferentPackMethods.DiffPackStaticMethod;

/*                     static method non          non static method
 * same class          1,2
 * Different class     2,3,4,
 * Different package   5,6 
 * 
 * 
 */
public class StaticMethodFromSameClass
{
 public static void main(String[] args) 
   {
	System.out.println("main method starts");
	//methodName();  
	method1();      //same class
	method2();      // same class
	
	//className.methodname
	DiffrenetClass.method3();        //DiffrenetClass
	DiffrenetClass.method2();        //DiffrenetClass
	DiffrenetClass.method4();        //DiffrenetClass
	DiffrenetClass.method3();        //DiffrenetClass
	
	
	DiffPackStaticMethod.method5();  // DiffPackStaticMethod
	DiffPackStaticMethod.method6();  // DiffPackStaticMethod
	DiffPackStaticMethod.method2();  // DiffPackStaticMethod
	DiffPackStaticMethod.method5();  // DiffPackStaticMethod
	
	
	System.out.println("main method ends");
	
   }
   public static void method1()
   {
	   System.out.println("Runing static method-1 from  the same class");
   }
	public static void method2()
   {
		System.out.println("Running static method-2 from the same class");
	}
}
