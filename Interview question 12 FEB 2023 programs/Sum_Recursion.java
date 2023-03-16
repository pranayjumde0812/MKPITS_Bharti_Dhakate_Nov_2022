/*WAP in java to print sum of naturals numbers using recursion*/
import java.util.Scanner;
class Sum_Recursion {
	static int sum(int num) {
		if(num<0) {
			return -1;
		}
		if(num== 0|| num == 1) {
			return num;
		}
		return num+sum(num-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the positive number  : ");
		int num=sc.nextInt();
		System.out.println("Sum = "+sum(num));
	}
}



