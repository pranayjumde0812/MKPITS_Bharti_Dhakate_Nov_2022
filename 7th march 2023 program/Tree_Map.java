import java.util.TreeMap;
class Tree_Map
{
	public static void main(String[]args)
	{
		TreeMap tm=new TreeMap();
		System.out.println("size "+tm.size());
		tm.put(1, "ram");
		tm.put(2, "lakhan");
		tm.put(3, "ajay");
		tm.put(4, "shubh");

		System.out.println("size "+tm.size());
		System.out.println("values in list "+tm);

	}
}