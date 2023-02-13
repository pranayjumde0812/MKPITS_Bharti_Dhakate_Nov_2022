/*Write a program to find whether a given year is a leap year or not */
import java.util.Scanner;
class assignment_1FEB_08
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check if it is leap or not ");
		int n=sc.nextInt();
		if(n%4==0)
		{
			System.out.println(n+" is leap year");
		}
		else
		{
			System.out.println(n+" is not leap year");
		}
	}
}
