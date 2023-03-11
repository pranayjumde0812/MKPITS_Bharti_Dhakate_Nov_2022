/*12)Animal interface and cat and dog classes:
Create an interface called Animal that has two abstract methods: makeSound() and move().
Then create two classes called Cat and Dog that implement the Animal interface.
The Cat class should have an instance variable for the cat's breed, and
the Dog class should have an instance variable for the dog's weight.
Implement the makeSound() and move() methods for each class */
import java.util.Scanner;
interface Animal{
	void makeSound();
	void move();
}
class Cat implements Animal {
	String breed;
	public Cat(String breed) {
		this.breed=breed;
	}
	public void makeSound() {
		System.out.println("Cat's breed : "+breed+"    Sound: Meow Meow ");
	}
	public void move() {
		System.out.println("Move: Hop-Hop ");
	}
}
class Dog implements Animal {
	float w;
	public Dog(float w) {
			this.w=w;
	}
	public void makeSound() {
		System.out.println("Dogs weight : "+w+"    Sound: Bark Bark ");
	}
	public void move() {
		System.out.println("Move: Jump ");
	}
}

public class Animal_Interface_12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Cats's breed : ");
		String breed=sc.nextLine();
		Cat ct=new Cat(breed);
		ct.makeSound();
		ct.move();
		System.out.println("\nEnter the Dog's  : ");
		float w=sc.nextInt();
		Dog dg=new Dog(w);
		dg.makeSound();
		dg.move();


	}
}
