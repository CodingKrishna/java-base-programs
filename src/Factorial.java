import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number to find factorial:");
		Scanner fact = new Scanner(System.in);
		int n=fact.nextInt();
		factorial(n);
	}
	public static int factorial(int num){
		int factorial=1;
		for (int i=1;i<=num;i++)
		{
		    factorial=factorial*i;
		}
		System.out.println("Factorial of given number is:" +factorial);
		return factorial;
		
	}

}