/*Write a program to check a given array of integers and return true if the
given array contains either 2 even or 2 odd values all next to each other.*/
import java.util.Scanner;
class assignment_25_19
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter the length of Array : ");
		int ln=sc.nextInt();
		int i;
		int arr[]=new int[ln];
		System.out.println("Enter the elements of Array :");
		for(i=0;i<ln;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<ln-1;i++)
		{
			if(arr[i]%2==0 && arr[i+1]%2==0 || arr[i]%2!=0 && arr[i+1]%2!=0)
			{
				check=true;
			}
		}
		return check;
	}

	public static void main(String[] args)
	{
		System.out.println(value());
	}
}
