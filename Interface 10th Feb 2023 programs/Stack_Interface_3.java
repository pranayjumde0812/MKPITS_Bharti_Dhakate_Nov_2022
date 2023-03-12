/*3)Stack interface and array and linked list classes:
Create an interface called Stack that has three abstract methods: push(), pop(), and peek().
Then create two classes called ArrayStack and LinkedListStack that implement the Stack interface.
The ArrayStack class should use an array to implement the stack, and the LinkedListStack class
should use a linked list to implement the stack. Implement the push(), pop(), and peek() methods for each class*/
import java.util.Scanner;
interface Stack {
	void push(int num);
	void pop();
	void peek();
}
class ArrayStack implements Stack {
	int size,top;
	int arr[];
	public ArrayStack(int size) {
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
	}
	public void push(int num) {
			arr[++top]=num;
			System.out.println("Element pushed : "+num);
	}
	public void pop() {
			int num= arr[top];
			top--;
			System.out.println("Popped element : "+num);
	}

	public void peek() {
		System.out.println("The element at top is : "+arr[top]);
	}

}
class LinkedListStack implements Stack {
	public void push(int num) {
	}
	public void pop() {
	}
	public void peek() {
	}
}
public class Stack_Interface_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int len=sc.nextInt();
		ArrayStack ast=new ArrayStack(len);
		System.out.println("Enter the elements to push within stack till length :");
		for(int i=0;i<len;i++)
		{
				int num=sc.nextInt();
				ast.push(num);
		}
		ast.pop();
		ast.peek();
	}
}
