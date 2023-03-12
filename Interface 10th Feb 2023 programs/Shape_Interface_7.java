/*7)Shape interface and circle and rectangle classes:
Create an interface called Shape that has two abstract methods: getArea() and getPerimeter().
Then create two classes called Circle and Rectangle that implement the Shape interface.
The Circle class should have an instance variable for the radius of the circle, and
the Rectangle class should have instance variables for the width and height of the rectangle.
Implement the getArea() and getPerimeter() methods for each class.*/
import java.util.Scanner;
interface Shape {
	void getArea();
	void getPerimeter();
}
class Circle implements Shape{
	int r;
	public Circle(int r) {
		this.r=r;
	}
	public void getArea()
	{
		System.out.println("Area of Square : "+(3.14*r*r));
	}
	public void getPerimeter()
	{
		System.out.println("Perimeter of Square : "+(2*3.14*r));
	}
}
class Rectangles implements Shape {
	int l,b;
	public Rectangles(int l, int b) {
		this.l=l;
		this.b=b;
	}
	public void getArea()
	{
		System.out.println("Area of rectangle : "+(l*b));
	}
	public void getPerimeter()
	{
		System.out.println("Perimeter of rectangle : "+(2*(l+b)));
	}
}

public class Shape_Interface_7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		int r=sc.nextInt();
		Circle cir=new Circle(r);
		cir.getArea();
		cir.getPerimeter();
		System.out.println();

		System.out.println("Enter the length and width of reactangle respectively : ");
		int l=sc.nextInt();
		int b=sc.nextInt();

		Rectangles rect=new Rectangles(l,b);
		rect.getArea();
		rect.getPerimeter();

	}
}
