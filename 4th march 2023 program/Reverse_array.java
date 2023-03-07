/*WAP in java to reverse the elements in array */
import java.util.Scanner;
class Reverse_array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int[] arr_reverse=new int[size];
		System.out.println("Enter the original array : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<(arr.length);i++)
		{
			arr_reverse[size-1]=arr[i];
			size=size-1;
		}
		System.out.println("Reverse array : ");
		for(int i=0;i<(arr_reverse.length);i++)
		{
			System.out.print(arr_reverse[i]+" ");
		}
		System.out.println();
	}
}