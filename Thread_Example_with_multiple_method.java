class Th1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try { sleep(1000); } catch (InterruptedException e){ }

			System.out.println(getName()+" : "+i);
		}
	}
}

class Th2 extends Thread
{
	public void run()
	{
		for(int i=10;i>0;i--)
		{
			System.out.println(getName()+" : "+i);
		}
	}
}

public class Thread_Example_with_multiple_method
{
	public static void main(String[] args)
	{
		Th1 ob1=new Th1();
		ob1.setName("Bachcha-1");
		Th2 ob2=new Th2();
		ob2.setName("Bachcha-2");
		System.out.println(ob1);
		System.out.println(ob2);

		Thread mth=Thread.currentThread(); //To print main thread of main class
		System.out.println(mth);
		ob1.start();
		ob2.start();
	}
}