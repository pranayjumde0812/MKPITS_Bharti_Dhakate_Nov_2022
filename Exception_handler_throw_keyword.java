class KangalException extends Exception
{
	KangalException(String s)
	{
		super (s);
	}
}

public class Exception_handler_throw_keyword
{
	public static void main(String[] args)throws Exception
	{
		int bal=3000;
		int withd=5000;
		if(bal>withd)
		{
			System.out.println("rupay le lo");
		}
		else
		{
			KangalException ob=new KangalException("paise nhi hai");
			throw ob;
		}
	}
}
