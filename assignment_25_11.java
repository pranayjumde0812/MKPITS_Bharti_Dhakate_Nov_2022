/* Write a program to check if a given array of integers contains 5 next
to a 5 somewhere. */
import java.util.Scanner;
public class assignment_25_11
{
	static int count=0;
	public int value()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int ln=sc.nextInt();
		int arr[] = new int[ln];
		System.out.println("Enter the element of array of lenght 10");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int k=0;k<ln;k++)
		{
			System.out.print(arr[k]+",");
		}
		System.out.println();
		for(int j=0;j<10;j++)
		{
			if(arr[j]==5 && arr[j+1]==5)
			{
				count++;
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{
		assignment_25_11 ob = new assignment_25_11();
		ob.value();
		System.out.println("Two 5's are next to each other appears "+count+" time in array");
	}
}