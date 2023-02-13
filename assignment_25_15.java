/*Write a program to check if a given array of integers contains a 3 or a 5.*/
import java.util.Scanner;
class assignment_25_15
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
			if(arr[i]==3 || arr[i]==5)
			{
				flag=1;
			}
		}
		if(flag==1)
		System.out.println("Array of integers contains 3's or 5's");
		else
		System.out.println("Array of integers does not contains 3's or 5's");
	}
}