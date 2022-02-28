package conditionalStatments;

public class IfElseIf2 
{
public static void main(String[] args) {
	int amount=200;
	if(amount>300)
	{
		System.out.println("you can travel from pune to mumbai");
	}
	else if(amount>200)
	{
		System.out.println("you can tarvel up to panvel");
	}
	else if(amount>100)
	{
		System.out.println("you can travel up to lonavala");
	}
	else if(amount>50)
	{
		System.out.println("you can travel up to  talegaon");
	}
	else
	{
		System.out.println("no possible to travel to me");
	}
}
}
