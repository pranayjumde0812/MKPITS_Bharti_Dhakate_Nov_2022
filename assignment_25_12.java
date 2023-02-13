/*Write a program to check whether a given array of integers contains 5's
and 7's. */
import java.util.Scanner;
class assignment_25_12
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Array : ");
		int ln=sc.nextInt();
		int i,flag=0;
		int arr[]=new int[ln];
		System.out.println("Enter the elements of Array :");
		for(i=0;i<ln;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<ln;i++)
		{
			if(arr[i]==5 || arr[i]==7)
			{
				flag=1;
			}
		}
		if(flag==1)
		System.out.println("Array of integers contains 5's and 7's");
		else
		System.out.println("Array of integers does not contains 5's and 7's");
	}
}