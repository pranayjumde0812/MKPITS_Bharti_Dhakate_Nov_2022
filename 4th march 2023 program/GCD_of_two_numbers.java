/*Write a java program to display GCD of two numbers*/
//Using recursive fuction
import java.util.Scanner;
class GCD_of_two_numbers
{
	static int gcd(int a,int b)
	{
		if(a==0)        //Everything divide 0
			return b;
		if(b==0)
			return a;

		if(a==b)
			return a;		//base case

		if(a>b)
			return gcd(a-b,b);
		else
			return gcd(a,b-a);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=gcd(a,b);
		System.out.println("GCD of two numbers is : "+c);
	}
}