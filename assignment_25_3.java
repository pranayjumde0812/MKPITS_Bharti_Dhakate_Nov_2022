/*Write a program to create a new array from two give array of
integers, each length 3. */
import java.util.Scanner;
class assignment_25_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr1=new int[3];
		int[] arr2=new int[3];
		int i;
		System.out.println("Enter the elements of array 1 of length 3");
		for(i=0;i<3;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of array 2 of length 3");
		for(i=0;i<3;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int arr3[]={arr1[0],arr1[1],arr1[2],arr2[0],arr2[1],arr2[2]};
		System.out.println("Combine New Array : ");
		for(i=0;i<6;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
	}
}