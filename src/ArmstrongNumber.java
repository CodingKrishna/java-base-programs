import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number to check armstrong or not:");
		Scanner scanner=new Scanner(System.in);
		int number =scanner.nextInt();
	    	armstrong(number);
	}
	private static int armstrong(int n) 
	{
		int sum=0,temp=n;
		while(n!=0)
		{		
		    int	remainder=n%10;
		    sum=sum+remainder*remainder*remainder;
		    n=n/10;
		}
		if(temp==sum)
		{
         	    System.out.println("It is armstrong number" );
		}
		else
		{
		    System.out.println("Not  an armstrong number" );	
		}
		return n;
	}
		
}	