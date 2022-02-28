package com.aspire.java.Collection.Map;
/* Map work in key value pair ,data type of key and value may same or diffrent, 
 * in that key is unique and value may duplicate
 * 
 */
import java.util.HashMap;

public class Map 
{
 public static void main(String[]  args) 
 {
	    HashMap<Integer, String> hm=new HashMap<Integer,String>();
	                   // key     Value
	                  hm.put(1, "Ashwini");
	                  hm.put(4, "Priyanka");
	                  hm.put(5, "Rutuja");
	                  hm.put(5, "vaibhav");
	                  hm.put(2, "Dhanjay");
	                  hm.put(3, "Dhanjay");
	                  System.out.println(hm);
	                  System.out.println(hm.containsKey(4));// true
	                  System.out.println(hm.containsValue("Ashwini"));// true
	                  System.out.println(hm.get(4));
	                  System.out.println("Data get for loop");
	                  for(int i = 1;i<hm.size();i++)
	                  {
	                	  System.out.print(i+", ");
	                  }
	                  System.out.println();
	                  hm.remove(4);
	                  System.out.println(hm);
	                  hm.put(6, "sagar");
	                  System.out.println(hm);
	                  hm.put(2, "Sachin");
	                  System.out.println(hm);
	                  	 
 }
	
}
