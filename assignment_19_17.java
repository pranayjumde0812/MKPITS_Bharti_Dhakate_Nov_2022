/* Write a program to check if two given non-negative integers have the
same last digit. */
import java.util.Scanner;
public class assignment_19_17
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two positive integer numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ld1=a%10;
		int ld2=b%10;
		if(ld1==ld2)
		{
			System.out.println("Both numbers have same last digit number");
		}
		else
		{
			System.out.println("Both numbers do not have same last digit number");
		}
	}
}
