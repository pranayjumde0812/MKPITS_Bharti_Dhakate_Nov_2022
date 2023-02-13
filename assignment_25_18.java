/*Write a program to check a given array of integers and return true if 
there is a 3 with a 5 somewhere later in the given array. */
/*Write a program to check a given array of integers and return true if the
given array contains two 5's next to each other, or two 5 separated by one
element.*/
import java.util.Scanner;
class assignment_25_18
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
			if(arr[i]==3 && arr[i+1]==5)
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