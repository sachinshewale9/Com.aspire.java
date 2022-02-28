package conditionalStatments;
// ATM operation
// cash widrawl,mini statment,balance check,pin code,fund transfer
public class SwitchStatment3 {
	public static void main(String[] args) {
		String input="cw";
		switch (input)
		{
		case  "cw":
			System.out.println("cash widrwal");
		break;
		case "ms":
			System.out.println("mini satatment");
			break;
			
		case "bc":
			System.out.println("balance check");
			break;
			
		case "pc":
			System.out.println("pin code");
			break;
			
		case "ft":
			System.out.println("fund transfer");
			break;
		default:
			System.out.println("invalide inpute");
		}
		
		
		
	}

}
