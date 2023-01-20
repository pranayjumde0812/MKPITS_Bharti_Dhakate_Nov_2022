import java.util.Scanner;
class Swap
{
	//Assignment 18 jan 2023 (Question 1)
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number :");
		int x=sc.nextInt();
		System.out.println("Enter the 2nd number :");
		int y=sc.nextInt();
		System.out.println("x = "+x+ "  y = "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping ");
		System.out.println("x = "+x+ "  y = "+y);
	}
}