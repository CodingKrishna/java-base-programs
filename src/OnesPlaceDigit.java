import java.util.Scanner;


public class OnesPlaceDigit 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		unitsPlaceDigit(number);
	}
	public static int unitsPlaceDigit(int num) 
	{
		int remainder =num%10;
		System.out.println("ones place digit is:" +remainder);
	 	return remainder;
	}
}	