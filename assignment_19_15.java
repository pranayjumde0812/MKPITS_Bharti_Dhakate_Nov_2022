/* Write a program to check whether two given integers are in the
range 40..50 inclusive, or they are both in the range 50..60
inclusive */
import java.util.Scanner;
public class assignment_19_15
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two integer numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>=40 && a<=50 && b>=40 && b<=50)
		{
			System.out.println("Both numbers are in 40 to 50 range");
		}
		if(a>=50 && a<=60 && b>=50 && b<=60)
		{
			System.out.println("Both numbers are in 50 to 60 range");
		}

	}
}