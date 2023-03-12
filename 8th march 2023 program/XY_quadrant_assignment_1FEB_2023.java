/*Write a java program to accept a coordinate point in a XY
coordinate system and determine in which quadrant the
coordinate point lies.*/
import java.util.Scanner;
class XY_quadrant_assignment_1FEB_2023 {
	static void quadrant(float x,float y)
	{
		if(x==0 && y==0) {
			System.out.println("Both x and y are in Origin ");
		}
		else if(x>0 && y>0) {
			System.out.println("Both x and y are in Ist Quadrant ");
		}
		else if(x<0 && y>0) {
					System.out.println("Both x and y are in IInd Quadrant ");
		}
		else if(x<0 && y<0) {
					System.out.println("Both x and y are in IIIrd Quadrant ");
		}
		else if(x>0 && y<0) {
					System.out.println("Both x and y are in IVth Quadrant ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X cordinate and Y cordinate respectively (Only positive or negative value, not zero): ");
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		System.out.println("X cordinate : "+x+"  Y cordinate : "+y);
		quadrant(x,y);
	}
}

