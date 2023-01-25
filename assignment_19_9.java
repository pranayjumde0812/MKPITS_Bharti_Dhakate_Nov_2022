/*Write a C program to check if a given positive number is a multiple of 3 or a multiple of 7.*/
import java.util.Scanner;
public class assignment_19_9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check if it is multiple of 3 or 7");
		int a=sc.nextInt();
		if(a%3==0 && a%7==0)
		{
			System.out.println(a+" is multiple of both 3 and 7");
		}
		else if(a%7==0)
		{
			System.out.println(a+" is multiple of 7");
		}
		else if(a%3==0)
		{
			System.out.println(a+" is multiple of 3");
		}
		else
			System.out.println(a+" is not multiple of both 3 and 7");
	}
}
