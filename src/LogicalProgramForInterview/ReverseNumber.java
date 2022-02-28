package LogicalProgramForInterview;
// num=12345;out put.........>54321
public class ReverseNumber 
{
 public static void main(String[] args) 
 {
	int num=12345;   // you can take any numbr like 542,4546,
	int rev=0;
	int rem=0;
	while(num>0)
	{
		rem=num%10;        // 5,4,3,2,1
		rev=rev*10+rem;    // 5,54,543,5432,
		num=num/10;		  //  num 1234, 123, 12, 1
	}
	System.out.println("reverse number is="+rev);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
