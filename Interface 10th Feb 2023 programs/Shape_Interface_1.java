/*1)Shape interface and rectangle and circle classes:
Create an interface called Shape that has two abstract methods: getArea() and getPerimeter().
Then create two classes called Rectangle and Circle that implement the Shape interface.
The Rectangle class should have instance variables for the length and width of the rectangle,
and the Circle class should have an instance variable for the radius of the circle.
Implement the getArea() and getPerimeter() methods for each class.*/
import java.util.Scanner;
interface Shapes {
	void getArea(int a,int c);
	void getPerimeter(int a,int c);
	void getArea(int a);
	void getPerimeter(int a);
}
class Rectangles implements Shapes{
	int l,b;
	public void getArea(int a,int c)
	{
		l=a;
		b=c;
		System.out.println("Area of rectangle : "+(l*b));
	}
	public void getPerimeter(int a,int c)
	{
		l=a;
		b=c;
		System.out.println("Perimeter of rectangle : "+(2*(l+b)));
	}
	public void getArea(int a){}
	public void getPerimeter(int a){}
}
class Circles implements Shapes {
	int r;
	public void getArea(int a)
	{
		r=a;
		System.out.println("Area of circle : "+(3.14*r*r));
	}
	public void getPerimeter(int a)
	{
		r=a;
		System.out.println("Perimeter of circle : "+(2*3.14*r));
	}
	public void getArea(int a,int c){}
	public void getPerimeter(int a,int c){}
}

public class Shape_Interface_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and width of reactangle respectively : ");
		int l=sc.nextInt();
		int b=sc.nextInt();

		Rectangles rect=new Rectangles();
		rect.getArea(l,b);
		rect.getPerimeter(l,b);
		System.out.println("Enter the radius of circle : ");
		int r=sc.nextInt();
		Circles cir=new Circles();
		cir.getArea(r);
		cir.getPerimeter(r);
	}
}
