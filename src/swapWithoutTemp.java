
public class swapWithoutTemp 
{
	public static void main(String[] args)
	{
		int a=20,b=25,A,B;
		swapWithoutTemp(a,b);
		
	}
	
	public static void swapWithoutTemp(int a, int b)
	{
		int A=a+b;
		int B=A-b;
		A=A-B;
		System.out.println("value of A is : "+A);
		System.out.println("value os b is : "+B);
	}

}
