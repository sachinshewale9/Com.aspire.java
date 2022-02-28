package LogicalProgramForInterview;
//Armstrong number 153=1*1*1+5*5*5+3*3*3=153 and also number like=370,407,153 are Armstrong number
public class ArmstrongNumber 
{
public static void main(String[]  args)
{
	int num=153;
	int rem=0;
	int sum=0;
	int origin=num;
	while(num>0)
	{
		rem=num%10;   //3,5,1
		sum=sum+rem*rem*rem;  //0+3*3*3=27,  5*5*5=27+125=152,  1*1*1=1+27+125+1=153
		num=num/10;  //15,1,0
	}
	System.out.println(sum);
	if(origin==sum)
	{
		System.out.println(origin + " Number is Armstrong number");
	}
	else
	{
		System.out.println(origin+" Number is not Armstrong number ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
