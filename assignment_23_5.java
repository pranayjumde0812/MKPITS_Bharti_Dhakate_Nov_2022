/* Write a program to check if a given number is within 2 of a
multiple of 10. */
import java.util.Scanner;
class assignment_23_5      /*You can't multiply a negative. And even
							if you could, negative numbers can't be
							primes nor composites, so they can't be
							multiples*/
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		if(a%10==2 || a%10==1 || a%10==0 || a%10==8 || a%10==9)
		{
			System.out.println(a+" is within 2 of multiple of 10");
		}
	}
}