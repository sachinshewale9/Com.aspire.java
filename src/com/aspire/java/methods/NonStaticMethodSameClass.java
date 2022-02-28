package com.aspire.java.methods;
//                     static method non          non static method
// same class            1,2                       11,12,
// Different class       2,3,4,                    12,13,14  
// Different package     5,6                       12,15,16
import com.aspire.java.DifferentPackMethods.DiffPackStaticMethod;




public class NonStaticMethodSameClass 
{
  public static void main(String[] args) 
   {
	System.out.println("main method starts");
	
	//className ObjectName = new className();
	NonStaticMethodSameClass object =new NonStaticMethodSameClass(); 
	
	//objectName.methodName
	object.method11();
	object.method12();
	object.method12();
	
	NonStaticMethodDifferentClass DCobject =new NonStaticMethodDifferentClass();
	DCobject.method12();  // never call static method with object referenec
	DCobject.method13();
	DCobject.method14();
	
	DiffPackStaticMethod DPObject= new DiffPackStaticMethod();
	 DPObject.method12();
	 DPObject.method15();
	 DPObject.method16();
       
	System.out.println("main method end");
   }
    public void method11()
    {
    	System.out.println("Runnig non Static void method-11 from the  same class ");
    }
    public void method12()
    {
    	System.out.println("Running non static method-12 from the  same class");
    }
}
