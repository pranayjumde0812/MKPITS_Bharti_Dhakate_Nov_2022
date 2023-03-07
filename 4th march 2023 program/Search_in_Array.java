/*WAP in java to search an element in the existing array */
import java.util.Scanner;
class Search_in_Array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int flag=0;
		System.out.println("Enter the element you want search in array : ");
		int num=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Number is present in array at "+(i+1)+" position");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("number is not present in array");
		}
	}
}