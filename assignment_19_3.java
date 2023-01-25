/* Write a Java  program to print the output of multiplication of three numbers
which will be entered by the user. */
import java.util.Scanner;
class assignment_19_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter three number for multiplication");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int res=a*b*c;
		System.out.println("Multiplication of Given numbers is : "+res);
	}
}
