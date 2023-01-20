class AOCdemo
{
	int r=9;
	double aoc, p=3.14;
	void aoc()
	{
		aoc = p*r*r;
	}
	void dis()
	{
		System.out.println("the AOC is "+aoc);
	}
}

public class ObjectAOC
{
	public static void main(String[] args)
	{
		AOCdemo ob = new AOCdemo();
		ob.aoc();
		ob.dis();
	}
}