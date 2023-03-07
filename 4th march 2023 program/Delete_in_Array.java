/*WAP to delete an element of a specified index in the existing
array*/
import java.util.Scanner;
class Delete_in_Array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int arr_delete[]=new int[9];
		System.out.println("Enter the array element of length 10 : ");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index to delete the element");
		int index=sc.nextInt();
		int j=0;
		for(int i=0;i<10;i++)
		{
			if(i==index)
				continue;
			arr_delete[j]=arr[i];
			j++;
		}
		System.out.println("After deleting : ");
		for(int i=0;i<9;i++)
		{
			System.out.print(arr_delete[i]+" ");
		}
		System.out.println();
	}
}