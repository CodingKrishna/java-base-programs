import java.util.Scanner;


public class GreatestNumber 
{
	public static void main(String[] args)
	{
		int a,b,c,largest;
		Scanner s= new Scanner(System.in);
		System.out.println("enter a b c values");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
	
		if(a>=b && a>=c)
			System.out.println("largest Number : "+a);
		if(b>=a && b>=c)
			System.out.println("largest Number : "+b);
		if(c>a && c>=b)
			System.out.println("largest Number : "+c);
	}

}
