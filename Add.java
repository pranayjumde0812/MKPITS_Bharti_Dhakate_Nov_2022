import java.util.Scanner;
class Add
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);  //System.in is a standard input stream
System.out.print("Enter first number ");
int a=sc.nextInt();
System.out.print("Enter second number");
int b=sc.nextInt();
int c=a+b;
System.out.println("Total = "+c);
}
}