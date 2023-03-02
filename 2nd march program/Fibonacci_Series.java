/*Write a java program to display range of FIBONACCI series of a number*/
/*Def:	a series of numbers in which each number (Fibonacci number) is the sum of the two preceding
numbers.The simplest is the series 1,1,2,3,5,8,etc.*/
import java.util.Scanner;
class Fibonacci_Series
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range till you want the fibonacci series");
		int range=sc.nextInt();
		int a=0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=range;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		System.out.println();
	}
}
