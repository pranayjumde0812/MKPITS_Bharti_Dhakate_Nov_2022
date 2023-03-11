/*13)Vehicle interface and bicycle and motorcycle classes:
Create an interface called Vehicle that has two abstract methods: start() and stop().
Then create two classes called Bicycle and Motorcycle that implement the Vehicle interface.
The Bicycle class should have an instance variable for the number of gears, and
the Motorcycle class should have an instance variable for the engine displacement.
Implement the start() and stop() methods for each class*/
import java.util.Scanner;
interface Vehical {
	void start();
	void stop();
}
class Bicycle implements Vehical {
	int gear;
	public Bicycle(int gear) {
		this.gear=gear;
	}
	public void start() {
		System.out.println("Bicycle starts ");
	}
	public void stop() {
		System.out.println("Bicycle stops");
	}
}
class Motorcycle implements Vehical {
	int engine;
	public Motorcycle(int engine) {
			this.engine=engine;
	}
	public void start() {
		System.out.println("Motorcycle starts ");
	}
	public void stop() {
		System.out.println("Motorcycle stops");
	}
}

public class Vehicle_Inerface_13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of grears for Bicycle : ");
		int gear=sc.nextInt();
		Bicycle bic=new Bicycle(gear);
		bic.start();
		bic.stop();
		System.out.println();

		System.out.println("Enter the engine displacement number for Motorcycle : ");
		int engine=sc.nextInt();
		Motorcycle moc=new Motorcycle(engine);
		moc.start();
		moc.stop();
	}
}