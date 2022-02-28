package com.aspire.java.PolymorphismMethodOverloading;

public class TestOverloading
{
public static void main(String[] args) 
{
        	//Parent object class
	        Overloading ol =new Overloading ();
	      //     ol.addition();
	     //         ol.addtion(12);
	    //         ol.additon("ATI");
	   //         ol.addition(20, 22);
	            
	     //  child object class     
	            ChildOverloading col = new ChildOverloading ();
	                             col.addition(100, 0);
	                             col.addition();
	                             col.addition(12, 14);
	                             col.addition(10, 12, 14, 16);
	                             col.addtion(10);
	                             
	            
}

}
