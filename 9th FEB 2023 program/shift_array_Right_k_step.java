/*WAP in java to Right rotate array by k-step position*/
import java.util.Scanner;
class shift_array_Right_k_step {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the number by which you want to Right-shift position in array and number should be less than length : ");
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
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			a[i]=arr[len-1];
			len--;
			System.out.println(a[i]+" "+i);
		}
		System.out.println();
		int count=0;
		for(int i=k;i<new_arr.length;i++)
		{
			new_arr[i]=arr[count];
			count++;
			System.out.println(new_arr[i]+" "+i);
		}
		for(int i=0;i<a.length;i++)
		{
			new_arr[i]=a[i];
		}
		System.out.println("After Right shift : ");
		for(int i=0;i<new_arr.length;i++)
		{
			System.out.print(new_arr[i]+" ");
		}
		System.out.println();
	}
}