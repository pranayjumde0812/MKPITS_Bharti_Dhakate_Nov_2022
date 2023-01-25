/*Write a program to check two given integers, and return true if one of
them is 30 or if their sum is 30.*/

import java.util.Scanner;
public class assignment_19_7
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check = false;
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==30 || b==30 || (a+b==30))
		{
			check=true;
		}

		return check;
	}

	public static void main(String[] args)
	{
		System.out.println(value());
	}

}


