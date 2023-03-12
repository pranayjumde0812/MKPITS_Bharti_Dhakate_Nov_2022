/*16)Game interface and chess and checkers classes:
Create an interface called Game that has two abstract methods: play() and getRules().
Then create two classes called Chess and Checkers that implement the Game interface.
The Chess class should have an instance variable for the number of pieces, and
the Checkers class should have an instance variable for the size of the board.
Implement the play() and getRules() methods for each class*/
import java.util.Scanner;
interface Game {
	void play();
	void getRules();
}
class Chess implements Game {
	int p;
	public Chess(int p) {
		this.p=p;
	}
	public void play() {
		System.out.println("Start playing Chess with "+p+" pieces on board");
	}
	public void getRules() {
		System.out.println("Follow the rules of Chess to play ");
	}
}
class Checkers implements Game {
	int s;
	public Checkers(int s) {
		this.s=s;
	}
	public void play() {
		System.out.println("Start playing Checkers on "+s+" size board");
	}
	public void getRules() {
		System.out.println("Follow the rules of Checkers to play ");
	}
}
class Game_Interface_16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of pieces on Chess board : ");
		int p=sc.nextInt();
		Chess ch=new Chess(p);
		ch.play();
		ch.getRules();
		System.out.println();
		System.out.println("Enter the size of Checkers board : ");
		int s=sc.nextInt();
		Checkers chk=new Checkers(s);
		chk.play();
		chk.getRules();
	}
}
