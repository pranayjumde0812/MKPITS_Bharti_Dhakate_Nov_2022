/*Write a method in Java which will remove any given character
from a String.*/
import java.util.Scanner;
class Remove_character
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String name=sc.nextLine();
		System.out.println("Enter the character you want to remove : ");
		String ch=sc.next();
		System.out.println(name.replace(ch,""));
    }
}