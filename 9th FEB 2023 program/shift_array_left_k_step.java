/*WAP in java to left rotate array by k-step position*/
import java.util.Scanner;
class shift_array_left_k_step {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the number by which you want to shift position in array and number should be less than length : ");
		int k=sc.nextInt();
		if(k>len-1)
		{
			System.out.println("Shift number is not less than len");
			System.exit(0);
		}
		int a[]=new int[k];
		int new_arr[]=new int[len];
		System.out.println("Enter the Elements an array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			a[i]=arr[i];
			//System.out.println(a[i]);
		}
		int count=0;
		for(int i=k;i<arr.length;i++)
		{
			new_arr[count]=arr[i];
			count++;
		}
		for(int i=0;i<a.length;i++)
		{
			new_arr[count]=a[i];
			count++;
		}
		System.out.println("After shift : ");
		for(int i=0;i<len;i++)
		{
			System.out.print(new_arr[i]+" ");
		}
	}
}

