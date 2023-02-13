/*Write a program to check if the value of each element is equal or greater
than the value of previous element of a given array of integers  */
import java.util.Scanner;
class assignment_25_30
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
		for(i=0;i<ln-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				flag=1;
			}
		}
		if(flag==1)
		System.out.println("the value of each element is not equal or greater than the value of previous element");
		else
		System.out.println("the value of each element is equal or greater than the value of previous element");
	}
}