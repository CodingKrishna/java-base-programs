import java.util.Scanner;


public class LargestNumber 
{
	public static void main(String[] args)
	{
		System.out.println("enter a and b values");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		largestNumber(a,b);
	}
	public static int largestNumber(int num1,int num2)
	{
		if(num1>num2)
		{
			System.out.println("a is largest number");
			return num1;
		}
		else
		{
			System.out.println("b is largest number");
			return num2;
		}
	}
}
