import java.util.Scanner;
class Reverse
{
	//Assignment 18 jan 2023 (Question 3)
	public static void main(String[] args)
	{
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int a=sc.nextInt();
		while(a!=0)
		{
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println("Reverse Number is : "+rev);
	}
}