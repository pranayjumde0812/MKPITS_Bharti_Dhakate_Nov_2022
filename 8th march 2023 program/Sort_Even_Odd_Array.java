/*WAP in java to sort even and odd number of array*/
import java.util.Scanner;
class Sort_Even_Odd_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		int sort_arr[]=new int[len];
		int count=0;
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<len;i++)
		{
			if(arr[i]%2==0)
			{
				sort_arr[count]=arr[i];
				count++;
			}
		}
		for(int i=0;i<len;i++)
		{
			if(arr[i]%2!=0)
			{
				sort_arr[count]=arr[i];
				count++;
			}
		}


		System.out.println("Even and Odd sorted Array : ");
		for(int i=0;i<len;i++)
		{
			System.out.print(sort_arr[i]+" ");
		}
		System.out.println();
	}
}