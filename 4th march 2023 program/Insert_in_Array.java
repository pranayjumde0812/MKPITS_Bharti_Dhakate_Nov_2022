/*WAP in java to insert an element to specified index*/
import java.util.Scanner;
class Insert_in_Array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,6,7,8};
		int len=arr.length;
		int arr_insert[]=new int[len+1];
		System.out.println("Enter the element you want to insert : ");
		int num=sc.nextInt();
		System.out.println("Enter position on which you want to insert the element : ");
		int pos=sc.nextInt();
		System.out.println("Original Array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int j=0;
		for(int i=0;i<arr_insert.length;i++)
		{
			if(i==pos)
			{
				arr_insert[i]=num;
			}
			else{
				arr_insert[i]=arr[j];
				j++;
			}
		}
		System.out.println("Array after insertion : ");
		for(int i=0;i<arr_insert.length;i++)
		{
			System.out.print(arr_insert[i]+" ");
		}
		System.out.println();
	}
}