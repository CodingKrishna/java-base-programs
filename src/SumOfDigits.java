import java.util.Scanner;


public class SumOfDigits 
{
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner number=new Scanner(System.in);
		int num=number.nextInt();
		//sumOfDigits(num);
	//}
	

	//public static void main(int num1)
	//{
		int sum=0;
		while(num!=0)
		{
			int remainder=num%10;
			sum=sum+remainder;
			num=num/10;
		}
		System.out.println("sum of digits : "+sum);
	}

}
