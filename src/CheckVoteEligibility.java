import java.util.Scanner;


public class CheckVoteEligibility 
{
	public static void main(String[] args) 
	{
		int age=0;
		System.out.println("Enter age of a person:");
		Scanner vote=new Scanner(System.in);
	   	 age=vote.nextInt();
		checkVoteEligibility(age);	
	}
	  public static void checkVoteEligibility(int age)
	  {
		if(age>=18)
		{
		     System.out.println("person is eligible for vote");
		}
		else
		{
		    System.out.println("person is not eligible for vote");
		}
	  }

}
