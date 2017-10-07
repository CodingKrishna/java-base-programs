import java.util.Scanner;

public class TransposeOf3x3Matrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements:");
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		     {
			x[i][j]=sc.nextInt();
		     }
		}
		
	       System.out.println("Matrix is:");
	       for (int i = 0; i < 3; i++)
	       {
	           for (int j = 0; j < 3; j++) 
	           {
	                System.out.print(x[i][j]+ " ");
	           }
	               System.out.println();
	       }

		System.out.println("Transpose of Matrix is:");
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
			System.out.print(x[j][i] + " ");
		    }
			System.out.println();
		}
	}
}