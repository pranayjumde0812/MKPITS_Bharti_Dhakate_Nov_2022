/*Write a program to count even number of elements in a given array of
integers. */
import java.util.Scanner;
class assignment_25_8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length for array");
		int ln=sc.nextInt();
		int[] arr=new int[ln];
		int i,count=0;
		System.out.println("Enter the elements of array");
		for(i=0;i<ln;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<ln;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("Number of even elements in Array is : "+count);
	}
}