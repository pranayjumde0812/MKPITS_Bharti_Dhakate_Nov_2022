/* Write a program to count the number of two 5's are next to
each other in an array of integers. Also count the situation
where the second 5 is actually a 6 */
import java.util.Scanner;
public class assignment_19_19
{
	static int count=0,ctr=0;
	public int value()
	{
		int arr[] = new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element of array of lenght 10");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int k=0;k<10;k++)
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
			if(arr[j]==5 && arr[j+1]==6)
			{
				ctr++;
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{
		assignment_19_19 ob = new assignment_19_19();
		ob.value();
		System.out.println("Two 5's are next to each other appears "+count+" time in array");
		System.out.println("5 and 6 are next to each other appears "+ctr+" time in array");
	}
}