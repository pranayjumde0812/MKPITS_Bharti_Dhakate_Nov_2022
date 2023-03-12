/*8)Sports interface and basketball and football classes:
Create an interface called Sports that has two abstract methods: playGame() and getEquipment().
Then create two classes called Basketball and Football that implement the Sports interface.
The Basketball class should have an instance variable for the ball's size, and the Football class
should have an instance variable for the football's shape. Implement the playGame() and getEquipment()
methods for each class.*/
import java.util.Scanner;
interface Sports {
	void playGame();
	void getEquipment();
}
class Basketball implements Sports {
	int s;
	public Basketball(int s) {
		this.s=s;
	}
	public void playGame() {
		System.out.println("Players starts the Basketball game. ");
	}
	public void getEquipment() {
			System.out.println("And the Basketball's size is "+s);
	}
}
class Football implements Sports {
	String sh;
	public Football(String sh) {
		this.sh=sh;
	}
	public void playGame() {
		System.out.println("Players starts the Football game. ");
	}
	public void getEquipment() {
			System.out.println("And the Football's shape is "+sh);
	}
}

class Sports_Interface_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basketball's size : ");
		int s=sc.nextInt();
		Basketball bas=new Basketball(s);
		bas.playGame();
		bas.getEquipment();


		System.out.println("Enter the Football's shape : ");
		String sh=sc.next();
		Football foo=new Football(sh);
		foo.playGame();
		foo.getEquipment();
	}
}
