/*WAP to compute the perimeter and area of rectangle with height 7 inches and width of 5 inches*/
public class Rectangle
{
	public static void main(String[] args)
	{
		int h=7,w=5;
		int aor,por;
		por=2*(h+w);
		System.out.println("Perimeter of a rectangle : "+por);

		aor=h*w;
		System.out.println("Area of a rectangle : "+aor);
	}
}
