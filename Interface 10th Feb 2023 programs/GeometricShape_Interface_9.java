/*9)GeometricShape interface and rectangle and circle classes:
Create an interface called GeometricShape that has one abstract method: getArea(). 
Then create two classes called Rectangle and Circle that implement the GeometricShape interface. 
The Rectangle class should have instance variables for the length and width of the rectangle, 
and the Circle class should have an instance variable for the radius of the circle. 
Implement the getArea() method for each class.*/
import java.util.Scanner;
interface GeometricShape {
	void getArea();
}
class Rectangles implements GeometricShape {
	int l,b;
	public Rectangles(int l, int b) {
		this.l=l;
		this.b=b;
	}
	public void getArea()
	{
		System.out.println("Area of rectangle : "+(l*b));
	}
}
class Circle implements GeometricShape {
	int r;
	public Circle(int r) {
		this.r=r;
	}
	public void getArea()
	{
		System.out.println("Area of Square : "+(3.14*r*r));
	}
}

public class GeometricShape_Interface_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and width of reactangle respectively : ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		Rectangles rect=new Rectangles(l,b);
		rect.getArea();
		System.out.println();
		
		System.out.println("Enter the radius of circle : ");
		int r=sc.nextInt();
		Circle cir=new Circle(r);
		cir.getArea();
	}
}