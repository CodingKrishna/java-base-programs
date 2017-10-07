import java.util.Scanner;

public class PrimesBetween1toN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scanner = new Scanner(System.in);	   
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();
		primesBetweenGivenNum(n);
	}	
	static String primesBetweenGivenNum(int number)   { 
		String  primeNumbers = "";
		for (int i = 1; i <= number; i++)  	   
		{ 		 		  
			int counter=0; 		  
			for(int num =i; num>=1; num--)
			{
			   if(i%num==0)
				{
				    counter = counter + 1;
				 }
			}
			if (counter ==2)
			{
				primeNumbers = primeNumbers + i + " ";
			}	
		  }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);
	      return primeNumbers;
	}

}	