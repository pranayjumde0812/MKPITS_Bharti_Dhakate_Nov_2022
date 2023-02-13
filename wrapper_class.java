public class wrapper_class
{
	public static void main(String[] args)
	{
		int a=2;
		//Primitive int to Integer object using constructor
		Integer ob=new Integer(a);
		System.out.println(ob);

		//Primitive int to Integer object using method
		Integer ob2=Integer.valueOf(a);
		System.out.println(ob2);

		//Integer Object to Primitive int
		int x=ob.intValue();
		System.out.println(x);

		//Integer object to String Object
		String iob=ob.toString();
		System.out.println(iob);

		//Primitive int to String object
		String iob2=Integer.toString(a);
		System.out.println(iob2);

		//String object to primitive int
		int y=Integer.parseInt(iob);
		System.out.println(y);

		//String object to integer object
		Integer z=Integer.valueOf(iob2);
		System.out.println(z);
	}
}