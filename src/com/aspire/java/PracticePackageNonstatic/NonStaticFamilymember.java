package com.aspire.java.PracticePackageNonstatic;

import com.aspire.java.PracticePackageNonstatic1.NonStaticFriends;

public class NonStaticFamilymember
{
public static void main(String[] args) 
  {
	System.out.println("Program start from Non static method");
	
      // call  from same class
	
	NonStaticFamilymember family = new NonStaticFamilymember();
	                      family.Mammi();
    NonStaticFamilymember famil1 =new  NonStaticFamilymember();
                          famil1.Father();
    NonStaticFamilymember family3 =new  NonStaticFamilymember();  
                          family3.Brother();
	
	// call  from different class
       NonStaticRelatives Relative1 = new NonStaticRelatives();
                          Relative1.Mama();
       NonStaticRelatives Relative2 =new   NonStaticRelatives();
                          Relative2.mami();
       NonStaticRelatives Relatives3 =new  NonStaticRelatives();
                          Relatives3.kaka();
	
	// call from different class
       NonStaticFriends Friends1 = new NonStaticFriends();
                        Friends1.Rohan();
       NonStaticFriends Friends2 = new NonStaticFriends();
                        Friends2.Ajay();
       NonStaticFriends Friends3 = new NonStaticFriends();
                        Friends3.Rohan();


System.out.println("Program End from Non static method");	
 }
	public void Mammi()
	{
		System.out.println("My mother name is Shakuntala ");
	}
	
	public void Father()
	{
		System.out.println("My father name is Laxman ");
	}
	
	public void Brother()
	{
		System.out.println("My brother name is Kishor");
	}
		
}
