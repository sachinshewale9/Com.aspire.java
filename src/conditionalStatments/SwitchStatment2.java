package conditionalStatments;
// Sunday-1,Monday-2------Saturday-7
public class SwitchStatment2 
{
public static void main(String[] args) {
	int day=5;
	switch(day)
	{
	case 1:
		System.out.println("today is sunday");
		break;
	case 2:
		System.out.println("today is monday");
		break;
	case 3:
		System.out.println("today is tuesady");
		break;
	case 4:
		System.out.println("today is wensady");
		break;
	case 5:
		System.out.println("today is thusady");
		break;
		
	case 6:
		System.out.println("today is friday");
		break;
	case 7:
		System.out.println("today is saturday");
		
	default:
		System.out.println("wrong input please verify again");
	}
	
}
}
