class thre1 implements Runnable     //Runnable is Interface
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" "+i);
		}
	}
}

public class Thread_using_Interface
{
	public static void main(String[] args)
	{
		thre1 ob=new thre1();
		ob.run();
	}
}

//Runnable is an interface which do not have access of class thread method like start(),etc.
//Refer program Thread_Interface_Using_Thread_Object