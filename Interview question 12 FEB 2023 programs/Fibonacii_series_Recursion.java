/*Java program to print Fibonacii series using recursion*/
import java.util.Scanner;
class Fibonacii_series_Recursion {
	static public int fibonacci(int n) {
		if (n < 0) {
		return -1;
		}
		if (n == 0 || n == 1) {
			return n;
		}
		int y= fibonacci(n-1) + fibonacci(n-2);
		System.out.println("f["+n+"] : "+fibonacci(n-1)+"   f["+n+"] : "+fibonacci(n-2));
		return y;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for fibonacii series : ");
		int num=sc.nextInt();
		int x=fibonacci(num);
		System.out.println(x);
	}
}
