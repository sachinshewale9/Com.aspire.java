package com.aspire.java.thisuperPract;

public class C1 extends P1
{
  int a=10;
  int b=20;
  int j=30;
 
 public void karuna()
{   int a=25;// local 
	System.out.println("global varaible from p1 class="+super.a);
	System.out.println("golable variable from same class="+this.a);
	System.out.println("LOcal varaible from same class="+a);
	
}
public static void main(String[] args) 
{
	
	 
	C1 ob = new C1();
	ob.karuna();

	
}









}