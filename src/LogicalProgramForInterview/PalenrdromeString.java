package LogicalProgramForInterview;

public class PalenrdromeString 
{
  public static void main(String  []args)
  {
	 String s ="AbccbA"; 
	 String rev="";
	 for(int i=s.length()-1;i>=0;i--) 
	 {
		rev=rev+s.charAt(i);
		 System.out.print(s.charAt(i));
	 }
	  // To check String is Palendrome or not
	if(s.equals(rev))
	{
		System.out.println("String is Palendrom ");
	}
	else
	{
		System.out.println("String is not Palindrom");
	}
	  
	  
	  
	  
	  
  }
	
	
	
	
	
	
	
	
	
	
}
