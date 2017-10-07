import java.util.Scanner;


public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		
        int num, reversenum = 0;
		System.out.println("Enter the number to reverse");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
	        while( num != 0 )
	     	 {
	         reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	        }	 
	      System.out.println("Reverse of entered number is " +reversenum);
	}

}
