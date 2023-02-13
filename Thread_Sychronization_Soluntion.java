class one1
{
	synchronized void dis(String m)   //synchronization using lock mechanism
	{
		System.out.print("[" +m);
		try { Thread.sleep(1000); } catch(InterruptedException e) { } //Thread.sleep use bacuase we did not extend class one1 with class Thread, if we had done that, then we have to write only sleep()
		System.out.println(" ]");
	}
}

class two implements Runnable
{
	Thread t;
	String s;
	one1 dob1; //object created for class one1 but not initialized

	two(one1 obref,String msg) //paramaterized constructor is created
	{
		t=new Thread(this);  //'this' keyword is used get the reference/scope of called object
		dob1=obref;
		s=msg;

		t.start();
	}

	public void run()
	{
		dob1.dis(s); //using class one1 method
	}
}

public class Thread_Sychronization_Soluntion
{
	public static void main(String[] args)
	{
		one1 ob=new one1();

		//All objects of class two using class one resource/method

		two ob1=new two(ob,"Hellow");    //sending parameters to constructor to use class one1 method
		two ob2=new two(ob,"my");
		two ob3=new two(ob,"Problem");
	}
}