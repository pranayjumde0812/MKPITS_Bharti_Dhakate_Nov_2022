/* Write a java program that reads in a five-digit integer and
determines whether or not its a palindrome. */
import java.util.Scanner;
class assignment_19_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int rem,rev=0;
		System.out.println("Enter five digit number to check if the number is palindrome");
		int a=sc.nextInt();
		if(a>9999 && a<100000)
		{
			int n=a;
			while(a!=0)
					{
					rem=a%10;
					rev=rev*10+rem;
						a=a/10;a
					}

					if(rev==n)
					{
						System.out.println(n+ " is palindrome number");
					}
					else
					{
						System.out.println(n+ " is not palindrome number");
					}
		}
		else
		{
			System.out.println("Entered number is not 5 digit number");
		}
	}
}


