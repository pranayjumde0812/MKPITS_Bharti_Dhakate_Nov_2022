/*4)Vehicle interface and car and motorcycle classes:
Create an interface called Vehicle that has two abstract methods: start() and stop().
Then create two classes called Car and Motorcycle that implement the Vehicle interface.
The Car class should have instance variables for the car's make and model, and
the Motorcycle class should have an instance variable for the motorcycle's engine size.
Implement the start() and stop() methods for each class.*/
import java.util.Scanner;
interface Vehical {
	void start();
	void stop();
}
class Car implements Vehical {
	String maker;
	String model;
	public void start() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter maker of Car and Model name for Car : ");
		this.maker=sc.nextLine();
		this.model=sc.nextLine();
		System.out.println("Car starts ");
	}
	public void stop() {
		System.out.println("Car stops");
	}
}
class Motorcycle implements Vehical {
	int engine;
	public void start() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Motorcyle's engine size : ");
		this.engine=sc.nextInt();
		System.out.println("Motorcycle starts ");
	}
	public void stop() {
		System.out.println("Motorcycle stops");
	}
}

public class Vehicle_Inerface_4 {
	public static void main(String[] args) {
		Car car=new Car();
		car.start();
		car.stop();
		System.out.println();
		Motorcycle moc=new Motorcycle();
		moc.start();
		moc.stop();
	}
}
