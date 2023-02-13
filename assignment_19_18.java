/* Write a program to check whether the sequence of numbers 1,
2, 3 appears in a given array of integers somewhere.*/
import java.util.Scanner;
public class assignment_19_18
{
	static int count=0;
	boolean value()
	{
		boolean check = false;
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
			if(arr[j]==1 && arr[j+1]==2 && arr[j+2]==3)
			{
				count++;
				check=true;
			}
		}
		return check;
	}

	public static void main(String[] args)
	{
		assignment_19_18 ob = new assignment_19_18();
		if(ob.value()==true)
		{
			System.out.println("Sequence of 1,2,3 appears in array "+count+" time.");
		}
		else
		System.out.println("Sequence of 1,2,3 do not appears in array");
	}
}