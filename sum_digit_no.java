import java.util.Scanner;
class sum_digit_no
{
	//Assignment 18 jan 2023 (Question 5)
	public static void main(String[] args)
	{
		int res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any positive number less than 500 ");
		int a=sc.nextInt();
		while(a>0 && a<500)
		{
			int rem=a%10;
			res=res+rem;
			a=a/10;
		}
		System.out.println("Sum of digit of given number is = "+res);
	}
}