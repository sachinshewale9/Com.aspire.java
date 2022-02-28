package conditionalStatments;
// It is also called as IfElse program
public class IfElseIf1 {
public static void main(String[] args) {
	int marks=50;
	if(marks>100)
	{
		System.out.println("Please reenter the marks correctly/valid");
	}
	else if(marks<75)
	{
		System.out.println("Result pass with Distinction");
	}
	else if(marks>=50)
	{
		System.out.println("Result pass with 1st class");
	}
	else if(marks>=40)
	{
		System.out.println("Result pass wih 2nd class");
	}
	else 
	{
		System.out.println("Result fail");
	
	}
}
}
