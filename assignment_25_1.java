/* Write a program to compute the sum of the two given arrays
of integers, length 3 and find the array which has the largest
sum. */
import java.util.Scanner;
class assignment_25_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr1=new int[3];
		int[] arr2=new int[3];
		int i,sum1=0,sum2=0;
		System.out.println("Enter the elements of array 1 of length 3");
		for(i=0;i<3;i++)
		{
			arr1[i]=sc.nextInt();
			sum1=sum1+arr1[i];
		}
		System.out.println("Enter the elements of array 2 of length 3");
		for(i=0;i<3;i++)
		{
			arr2[i]=sc.nextInt();
			sum2=sum2+arr2[i];
		}
		if(sum1>sum2)
		{
			System.out.println("Array 1 elements has largest sum");
		}
		else
		{
			System.out.println("Array 2 elements has largest sum");
		}
	}
}

