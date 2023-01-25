/*Write a program to compute the sum of the two given integer values.
If the two values are the same, then return triple their sum.*/
import java.util.Scanner;
class assignment_19_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two integer");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		if(a==b)
		{
			System.out.println("Triple of sum : "+res*3);
		}
		else
		{
			System.out.println("Sum : "+res);
		}
	}
}