import java.util.Scanner;


public class CheckLeapYear
{
	public static void main(String[] args) 
	{
		
		int year=0;
		System.out.println("Enter year:");
		Scanner leap=new Scanner(System.in);
	    year=leap.nextInt();
		checkLeapOrNot(year);
	}
        
	public static void checkLeapOrNot(int year)
	{
    	if(year%4==0)
 		{
 			System.out.println("It is leap year");
 		}
 		else
		{
 			System.out.println("It is not leap year");
 		}
  	 }

}