import java.util.Scanner;

public class SumOfSquars 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Integer: ");
		int n = sc.nextInt();
		System.out.println("You entered: " + n);

		int sum = 1;

		for (int x = 2; x <= n; x++) 
		{
			sum = sum + (x * x);
		}
		System.out.println(sum);

	}
}	