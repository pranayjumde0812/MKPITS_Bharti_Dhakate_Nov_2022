/* Write a program to find the largest value from first, last, and middle
elements of a given array of integers of odd length (atleast 1)  */
import java.util.Scanner;
class assignment_25_7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the odd length for array");
		int ln=sc.nextInt();
		int[] arr=new int[ln];
		if(ln%2!=0)
		{
			System.out.println("Enter the elements of array");
			for(int i=0;i<ln;i++)
			{
				arr[i]=sc.nextInt();
			}
			if(arr[0]>arr[ln/2] && arr[0]>arr[ln-1])
			{
				System.out.println("Largest number between first, middle and last element: "+arr[0]);
			}
			else if(arr[ln/2]>arr[0] && arr[ln/2]>arr[ln-1])
			{
				System.out.println("Largest number between first, middle and last element: "+arr[ln/2]);
			}
			else if(arr[ln-1]>arr[0] && arr[ln-1]>arr[ln/2])
			{
				System.out.println("Largest number between first, middle and last element: "+arr[ln-1]);
			}
		}
	}
}

