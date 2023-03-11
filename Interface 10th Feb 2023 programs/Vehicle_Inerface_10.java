/*10)Vehicle interface and car and truck classes:
Create an interface called Vehicle that has two abstract methods: drive() and stop().
Then create two classes called Car and Truck that implement the Vehicle interface.
The Car class should have instance variables for the car's make and model, and the
Truck class should have instance variables for the truck's load capacity and towing capacity.
Implement the drive() and stop() methods for each class.*/
import java.util.Scanner;
interface Vehical {
	void drive();
	void stop();
}
class Car implements Vehical {
	String maker;
	String model;
	public Car(String maker, String model) {
			this.maker=maker;
			this.model=model;
	}
	public void drive() {
		System.out.println("Car made by "+maker+" and model number "+model+" starts ");
	}
	public void stop() {
		System.out.println("Car stops");
	}
}
class Truck implements Vehical {
	int load,tow;
	public Truck(int load, int tow) {
				this.load=load;
				this.tow=tow;
	}
	public void drive() {
		System.out.println("Truck of loading capacity "+load+" and towing capacity "+tow+" starts ");
	}
	public void stop() {
		System.out.println("Motorcycle stops");
	}
}

public class Vehicle_Inerface_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter maker of Car and Model name for Car respectively : ");
		String maker=sc.nextLine();
		String model=sc.nextLine();
		Car car=new Car(maker,model);
		car.drive();
		car.stop();
		System.out.println();
		System.out.println("Enter Truck's loading and towing capacity respectively : ");
		int load=sc.nextInt();
		int tow=sc.nextInt();
		Truck tuc=new Truck(load,tow);
		tuc.drive();
		tuc.stop();
	}
}
