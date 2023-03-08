/*WAP in java to Find the average of an Array */
import java.util.Scanner;
class Average_of_Array{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		int sum=0;
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<len;i++)
		{
			sum=sum+arr[i];
		}
		float avg=sum/len;
		System.out.println("Average of array : "+avg);
	}
}