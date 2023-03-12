/*15)Color interface and red, green, and blue classes:
Create an interface called Color that has one abstract method: getColorCode().
Then create three classes called Red, Green, and Blue that implement the Color interface.
Each class should have an instance variable for its corresponding color code (e.g., "FF0000" for red).
Implement the getColorCode() method for each class.*/
interface Color {
	void getColorCode();
}
class Red implements Color {
	String red="#FF0000";
	public void getColorCode()
	{
		System.out.println("You get "+red+" for Red");
	}
}
class Green implements Color {
	String green="#00FF00";
	public void getColorCode()
	{
		System.out.println("You get "+green+" for Green");
	}
}
class Blue implements Color {
	String blue="#0000FF";
	public void getColorCode()
	{
		System.out.println("You get "+blue+" for Blue");
	}
}
class Color_Interface_15 {
	public static void main(String[] args) {
		Red red=new Red();
		red.getColorCode();
		Green green=new Green();
		green.getColorCode();
		Blue blue=new Blue();
		blue.getColorCode();
	}
}