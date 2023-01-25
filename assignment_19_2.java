/*Write a Java  program to print the result of the specified operations.
-1 + 4 * 6

( 35+ 5 ) % 7

14 + -4 * 6 / 11

2 + 15 / 6 * 1 - 7 % 2*/
class assignment_19_2
{
	public static void main(String[] args)
	{
		int i=(-1+4*6);
		int j=((35+5)%7);
		int k=(14+(-4)*6/11);
		int m=(2+15/6*1-7%2);
		System.out.println("-1+4*6 = "+i);
		System.out.println();
		System.out.println("(35+5)%7 = "+j);
		System.out.println();
		System.out.println("14+(-4)*6/11 = "+k);
		System.out.println();
		System.out.println("2+15/6*1-7%2 = "+m);
		System.out.println();
	}
}