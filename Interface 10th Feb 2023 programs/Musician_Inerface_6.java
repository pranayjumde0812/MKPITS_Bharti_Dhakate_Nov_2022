/*6)Musician interface and guitar and drums classes:
Create an interface called Musician that has two abstract methods: playInstrument() and sing().
Then create two classes called Guitarist and Drummer that implement the Musician interface.
The Guitarist class should have an instance variable for the guitar's brand, and the Drummer class
should have an instance variable for the drum's size. Implement the playInstrument() and sing() methods for each class.*/
import java.util.Scanner;
interface Musician {
	void playInstrument();
	void sing();
}
class Guitarist implements Musician {
	String brand;
	public void playInstrument() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand name of Guitar : ");
		this.brand=sc.nextLine();
		System.out.println("Guitarist starts playing the instrument");
	}
	public void sing() {
		System.out.println("Guitarist starts singing also");
	}
}
class Drummer implements Musician {
	int size;
	public void playInstrument() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Drum's size : ");
		this.size=sc.nextInt();
		System.out.println("Drummer starts playing the Drum ");
	}
	public void sing() {
		System.out.println("Drummer starts singing also");
	}
}

public class Musician_Inerface_6 {
	public static void main(String[] args) {
		Guitarist gut=new Guitarist();
		gut.playInstrument();
		gut.sing();
		System.out.println();
		Drummer dum=new Drummer();
		dum.playInstrument();
		dum.sing();
	}
}