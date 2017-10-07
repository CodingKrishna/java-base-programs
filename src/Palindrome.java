import java.util.Scanner;


public class Palindrome{
	public static void main(String[] args)
	{
		System.out.println("Enter a number to check palindrome or not:");
		Scanner palindrome=new Scanner(System.in);
	 	int number =palindrome.nextInt();
	  	palindrome(number);
	}
	public static int palindrome(int n)
	{
		int temp=n;
		int remainder=0;
		int reverse=0;
		while(n>0)
		{
		    remainder=n%10;
		    reverse=reverse*10+remainder;
		    n=n/10;
		}
		if (temp==reverse)
		{
		     System.out.println("It is palindrome number");
		}
		else
		{
	             System.out.println("Not a palindrome");
		}
		return reverse;
	}
		
}