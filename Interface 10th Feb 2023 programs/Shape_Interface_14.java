/*14)Shape interface and ellipse and rhombus classes:
Create an interface called Shape that has two abstract methods: getArea() and getPerimeter().
Then create two classes called Ellipse and Rhombus that implement the Shape interface.
The Ellipse class should have instance variables for the major and minor axes,
and the Rhombus class should have instance variables for the diagonals.
Implement the getArea() and getPerimeter() methods for each class.*/
import java.util.Scanner;
interface Shape {
	void getArea();
	void getPerimeter();
}
class Ellipse implements Shape{
	int major,minor;
	public Ellipse(int major, int minor) {
		this.major=major;
		this.minor=minor;
	}
	public void getArea()
	{
		System.out.println("Area of Ellipse : "+(3.14*major*minor));
	}
	public void getPerimeter()
	{
		System.out.println("Perimeter of Ellipse : "+(2*(Math.sqrt(((major*major)+(minor*minor))/2))));
	}
}
class Rhombus implements Shape {
	int d1,d2,s;
	public Rhombus(int d1, int d2, int s) {
		this.d1=d1;
		this.d2=d2;
		this.s=s;
	}
	public void getArea()
	{
		System.out.println("Area of Rhombus : "+(0.5*d1*d2));
	}
	public void getPerimeter()
	{
		System.out.println("Perimeter of Rhombus : "+s*4);
	}
}

public class Shape_Interface_14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the major and minor axis of Ellipse respectively : ");
		int major=sc.nextInt();
		int minor=sc.nextInt();
		Ellipse ell=new Ellipse(major,minor);
		ell.getArea();
		ell.getPerimeter();
		System.out.println();

		System.out.println("Enter the diagonals of Rhombus d1,d2 respectively : ");
		int d1=sc.nextInt();
		int d2=sc.nextInt();
		System.out.println("Enter the side of Rhombus  : ");
		int s=sc.nextInt();
		Rhombus rhm=new Rhombus(d1,d2,s);
		rhm.getArea();
		rhm.getPerimeter();

	}
}
