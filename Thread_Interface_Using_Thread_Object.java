class Thre1 implements Runnable
{
	Thread t1;       //class Thread object is created to use Class Thread Methods

	public Thre1()  //constructor created for Thre1 class
	{
		t1=new Thread(this);  //initialized the Thread class object and taking a reference of class 'Thre1' object from main class
		t1.start();   //now we can access the class Thread object in Thread Interface type
	}

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(t1.getName()+" "+i);
		}
	}
}

public class Thread_Interface_Using_Thread_Object
{
	public static void main(String[] args)
	{
		Thre1 ob=new Thre1();
		Thre1 ob2=new Thre1();
	}
}