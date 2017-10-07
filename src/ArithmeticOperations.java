
public class ArithmeticOperations 
{
	public static void main(String[] args)
	{
		int a=20,b=5;
		add(a,b);
		subtraction(a,b);
		multiplication(a,b);
		divison(a,b);
	}
	
	static int add(int num1,int num2)
	{
		int sum=num1+num2;
		System.out.println("addition of two numbers : "+sum);
		return sum;
	}
	
	static int subtraction(int num1,int num2)
	{
		int subtraction=num1-num2;
		System.out.println("subtraction of two values : "+subtraction);
		return subtraction;
	}
	static int multiplication(int num1,int num2)
	{
		int multiplication=num1*num2;
		System.out.println("multiplication of two values : "+multiplication);
		return multiplication;
	}

	static int divison(int num1,int num2)
	{
		int divison=num1/num2;
		System.out.println("divison of two values : "+divison);
		return divison;
	}


}
