/* Write a program to compute the sum of values in a given array of integers
except the number 17. Return 0 if the given array has no integer.*/
import java.util.Scanner;
class assignment_25_9
{
	int logic()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length for array");
		int ln=sc.nextInt();
		int[] arr=new int[ln];
		int i,sum=0;
		System.out.println("Enter the elements of array");
		if(ln>0)
		{
			for(i=0;i<ln;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(i=0;i<ln;i++)
			{
				if(arr[i]!=17)
				sum +=arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args)
	{
		assignment_25_9 ob=new assignment_25_9();
		int a=ob.logic();
		System.out.println("sum of values in a given array of integers except the number 17 : "+a);
	}
}



