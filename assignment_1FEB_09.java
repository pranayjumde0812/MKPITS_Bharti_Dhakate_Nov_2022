/*Write a program to read the age of a candidate and determine whether 
it is eligible for casting his/her own vote */
import java.util.Scanner;
class assignment_1FEB_09
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age to check if candidate is eligible or not ");
		int n=sc.nextInt();
		if(n>=18)
		{
			System.out.println(n+" is eligible candidate to vote");
		}
		else
		{
			System.out.println(n+" is not eligible candidate to vote");
		}
	}
}
