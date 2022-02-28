package LogicalProgramForInterview;
// palindrome which called as intial and last digit same like121.515,212,etc
public class PalindromeNumber 
{
public static void main(String[] args) 
{
	int num=121;
	int rev=0;
	int rem=0;
	int temp=num;
	while( num>0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	
	if(rev==temp)
	{
		System.out.println("Number is palindrom");
	}
	else 
	{
		System.out.println("number is not palindrome");
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
