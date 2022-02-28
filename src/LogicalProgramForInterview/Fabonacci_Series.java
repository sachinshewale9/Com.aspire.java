package LogicalProgramForInterview;
// Fabanacci series=0,1,1,2,3,5,8,13,21,34
public class Fabonacci_Series 
{
public static void main(String  []args)
{
	int[]a= new int[10];
	a[0]=0;
	a[1]=1;
	for(int i=2;i<a.length;i++)   // for store the array
	{
		a[i]=a[i-1]+a[i-2];     // a[2]=a[1]a[0]=1
	}
	for(int j=0;j<a.length;j++) // to print the values from array
	{
		System.out.print(a[j]+",");
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
