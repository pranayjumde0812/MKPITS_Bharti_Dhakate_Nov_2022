/*Write Java Program to calculate square root of number*/
import java.util.Scanner;
import java.lang.Math.*;

class Square_root
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the square root of it : ");
		int num=sc.nextInt();
		System.out.format("Square root of "+num+" is %.3f",Math.sqrt(num));
		System.out.println();
	}
}
