/*Write a program to create a new array swapping the first and
last elements of a given array of integers and length will be
least 1.  */
import java.util.Scanner;
class assignment_25_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length for array 'length atleast 1'");
		int ln=sc.nextInt();
		int[] arr1=new int[ln];
		int[] arr2=new int[ln];
		System.out.println("Enter the elements of array");
		for(int i=0;i<ln;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int n=ln;
		System.out.print(" elements of new array are : ");
		for(int j=0;j<ln;j++)
		{
			if(j==0)
				arr2[0]=arr1[n-1];
			else if(j==ln-1)
				arr2[ln-1]=arr1[0];
			else
				arr2[j]=arr1[j];
			System.out.print(arr2[j]+" ");
		}
		System.out.println();
	}
}

