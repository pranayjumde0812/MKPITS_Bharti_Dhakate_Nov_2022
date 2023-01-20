import java.util.Scanner;
class bits_left_shift
{
	//Assignment 18 jan 2023 (Question 2)
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want shift by 2-bits");
		int a=sc.nextInt();
		a = a << 2;
		System.out.println("After two-bits shift => a = "+a);
	}
}