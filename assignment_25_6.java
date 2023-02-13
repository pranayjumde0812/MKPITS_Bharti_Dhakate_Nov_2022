/*Write a Java  program to print on screen the output of adding,
subtracting, multiplying and dividing of two numbers which will
be entered by the user. */
import java.util.Scanner;
class assignment_25_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int b=sc.nextInt();
		System.out.println("Addition of "+a+" and "+b+ " : "+(a+b));
		System.out.println("Substraction of "+a+" and "+b+ " : "+(a-b));
		System.out.println("Multiplication of "+a+" and "+b+ " : "+(a*b));
		System.out.println("division of "+a+" and "+b+ " : "+(a/b));
	}
}


