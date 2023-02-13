/* Write a program to check if the sum of all 5' in the array exactly 15
in a given array of integers. */
import java.util.Scanner;
class assignment_25_13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int ln=sc.nextInt();
		int sum=0;
		System.out.println("Enter the elements of array ");
		int arr[]=new int[ln];
		for(int i=0;i<ln;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<ln;i++)
		{
			if(arr[i]==5)
			sum += arr[i];
		}
		if(sum==15)
		{
			System.out.println("the sum of all 5' in the array exactly 15 in a given array of integers");
		}
		else
		{
			System.out.println("the sum of all 5' in the array is not exactly 15 in a given array of integers");
		}
	}
}