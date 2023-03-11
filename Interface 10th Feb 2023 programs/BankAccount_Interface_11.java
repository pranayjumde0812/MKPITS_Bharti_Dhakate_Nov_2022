/*11)BankAccount interface and checking and savings classes:
Create an interface called BankAccount that has three abstract methods: getBalance(), deposit(), and withdraw().
Then create two classes called CheckingAccount and SavingsAccount that implement the BankAccount interface.
The CheckingAccount class should have an instance variable for the account's overdraft limit,
and the SavingsAccount class should have an instance variable for the account's interest rate.
Implement the getBalance(), deposit(), and withdraw() methods for each. */
import java.util.Scanner;
interface BankAccount {
	void getBalance();
	void deposit();
	void withdraw();
}
class CheckingAccount implements BankAccount {
	int limit;
	public CheckingAccount(int limit) {
		this.limit=limit;
	}
	public void getBalance() {
		System.out.println("Check your Account Balance ");
	}
	public void deposit() {
		System.out.println("Please deposite money in your Account");
	}
	public void withdraw() {
		System.out.println("Do you want withdraw Money from your Account??   Limit for withdrwal is "+limit);
	}
}
class SavingsAccount implements BankAccount {
	int air;
	public SavingsAccount(int air) {
		this.air=air;
	}
	public void getBalance() {
		System.out.println("Check your Saving Account Balance ");
	}
	public void deposit() {
		System.out.println("Please deposite money in your Account.    Saving accounts's Interst Rate is :"+air);
	}
	public void withdraw() {
		System.out.println("Do you want withdraw Money from your Saving Account??");
	}
}
public class BankAccount_Interface_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for Checking Account : ");
		int limit=sc.nextInt();
		CheckingAccount ca=new CheckingAccount(limit);
		ca.getBalance();
		ca.deposit();
		ca.withdraw();
		System.out.println("\nEnter the Account's Interest Rate for Saving Account : ");
		int air=sc.nextInt();
		SavingsAccount sa=new SavingsAccount(air);
		sa.getBalance();
		sa.deposit();
		sa.withdraw();
	}
}