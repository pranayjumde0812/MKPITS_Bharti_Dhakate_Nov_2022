/*WAP in java to transpose of matrix*/
import java.util.Scanner;
class Transpose_Matrix
{
	public static void main(String[]args)
	{
		int orignal[][]=new int[2][2];
		int trans[][]=new int[2][2];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of matrix1");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				orignal[i][j]=sc.nextInt();
			}
		}

		System.out.println(" transpose of matrix is ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				trans[i][j]=orignal[j][i];
				System.out.print(trans[i][j]+"  ");
			}
		System.out.println("\n");
		}
	}
}