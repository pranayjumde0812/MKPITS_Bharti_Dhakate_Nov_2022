/*Write a program to check a given array of integers and return true if the
value 5 appears 5 times and there are no 5 next to each other. */
import java.util.Scanner;
class assignment_25_20
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter the length of Array : ");
		int ln=sc.nextInt();
		int i,count=0,flag=0;
		int arr[]=new int[ln];
		System.out.println("Enter the elements of Array :");
		for(i=0;i<ln;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(i=0;i<ln;i++)
		{
			if(arr[i]==5 && i+1<ln && arr[i+1]!=5)
			{
				count++;
			}
		}
		if(count==5)
		{
			check=true;
		}
		return check;
	}

	public static void main(String[] args)
	{
		System.out.println(value());
	}
}