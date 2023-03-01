/*WAP to calculate bike average consumption from given total distance (integer value)
travelled in km and spend fuel (in liters, float number : 2 decimal point)*/
import java.util.Scanner;
public class bike_average
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total distance travelled in km :");
		int dis=sc.nextInt();
		System.out.println("Enter the spend fuel in liters :");
		float fuel=sc.nextFloat();

		float avg=dis/fuel;
		System.out.format("Bike average : %.2f\n",avg);
	}
}

