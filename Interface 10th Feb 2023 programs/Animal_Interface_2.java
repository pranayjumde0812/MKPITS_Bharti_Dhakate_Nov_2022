/*2)Animal interface and dog and cat classes:
Create an interface called Animal that has two abstract methods: makeSound() and move().
Then create two classes called Dog and Cat that implement the Animal interface. The Dog class
should have an instance variable for the dog's breed, and the Cat class should have an
instance variable for the cat's name. Implement the makeSound() and move() methods for each class.*/
import java.util.Scanner;
interface Animal{
	void makeSound(String s);
	void move(String s);
}
class Dog implements Animal {
	String breed;
	public void makeSound(String s) {
		breed=s;
		System.out.println("Dogs breed : "+breed+"    Sound: Bark Bark ");
	}
	public void move(String s) {
		breed=s;
		System.out.println("Move: Jump ");
	}
}

class Cat implements Animal {
	String name;
	public void makeSound(String s) {
		name=s;
		System.out.println("Cat's name : "+name+"    Sound: Meow Meow ");
	}
	public void move(String s) {
		name=s;
		System.out.println("Move: Hop-Hop ");
	}
}

public class Animal_Interface_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Dog's breed : ");
		String db=sc.nextLine();
		Dog dg=new Dog();
		dg.makeSound(db);
		dg.move(db);

		System.out.println("Enter the Cats's name : ");
		String cn=sc.nextLine();
		Cat ct=new Cat();
		ct.makeSound(cn);
		ct.move(cn);
	}
}