/* Write a program to accept the height of a person in
centimeter and categorize the person according to their height.*/
import java.util.Scanner;
class assignment_1FEB_11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Person Height in cm");
		float h=sc.nextFloat();
		if(h<150)
		{
			System.out.println("Person is shorter in height");
		}
		else if(h>=150 && h<165)
		{
			System.out.println("Person is average in height");
		}
		else if(h>=165 && h<195)
		{
			System.out.println("Person is taller in height");
		}
		else
		{
			System.out.println("Person is way taller than tall person in height");
		}
	}
}