/*5)Shape interface and square and triangle classes:
Create an interface called Shape that has two abstract methods: getArea() and getPerimeter().
Then create two classes called Square and Triangle that implement the Shape interface.
The Square class should have an instance variable for the side length of the square, and
the Triangle class should have instance variables for the base and height of the triangle.
Implement the getArea() and getPerimeter() methods for each class*/
import java.util.Scanner;
interface Shape {
	void getArea();
	void getPerimeter();
}
class Square implements Shape{
	int s;
	public Square(int s) {
		this.s=s;
	}
	public void getArea()
	{
		System.out.println("Area of Square : "+(s*s));
	}
	public void getPerimeter()
	{
		System.out.println("Perimeter of Square : "+(4*s));
	}
}
class Triangle implements Shape {
	int h,b,s1;
	public Triangle(int h, int b, int s1) {
		this.h=h;
		this.b=b;
		this.s1=s1;
	}
	public void getArea()
	{
		System.out.println("Area of Triangle : "+(0.5*b*h));
	}
	public void getPerimeter()
	{
		System.out.println("Perimeter of Triangle : "+(2*s1+b));
	}
}

public class Shape_Interface_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the Square : ");
		int s=sc.nextInt();
		Square sqr=new Square(s);
		sqr.getArea();
		sqr.getPerimeter();

		System.out.println();

		System.out.println("Enter the base and height of triangle respectively : ");
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("Enter the side of triangle : ");
		int s1=sc.nextInt();
		Triangle trg=new Triangle(h,b,s1);
		trg.getArea();
		trg.getPerimeter();
	}
}

