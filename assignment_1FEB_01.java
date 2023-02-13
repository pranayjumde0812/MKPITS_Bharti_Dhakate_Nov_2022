/*Write a program to check a given array (length will be atleast 2) of
integers and return true if there are two values 15, 15 next to each
other. */
import java.util.Scanner;
class assignment_1FEB_01
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter the length of array greater than 2");
		int ln=sc.nextInt();
		if(ln>1)
		{
			System.out.println("Enter the elements of array ");
			int arr[]=new int[ln];
			for(int i=0;i<ln;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<ln-1;i++)
			{
				if(arr[i]==15 && arr[i+1]==15)
				{
					check=true;
				}
			}
		}
		else
			System.out.println("Length should be greater than 1");
		return check;
	}

	public static void main(String[] args)
	{
		System.out.println(value());
	}
}

