package com.aspire.java.Opps.Interface2;

public class Samsung implements Mobile
{

	
	public void camera()
	{
		System.out.println("camera: 32 mpa");
		
	}


	public void selfiecamera() 
	{
	 System.out.println("selfie camera:48 mpa");	
		
	}

	@Override
	public void battery() 
	{
	 System.out.println("Batttery:5000 MAh");
		
	}

	
	public void Touchscree() 
	{
	 System.out.println("Touch screen :5.5 inches");	
	}
	
	public void RAM() // SAMSUNG ------->RAM
	{
		System.out.println(" SAmsung RAm:16GB");
	}

}
