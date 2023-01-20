class AVGdemo
{
	int a=45,b=67,c=32,d=98,e=3;
	double avg;
	void avg()
	{
		avg = (double)(a+b+c+d+e)/5;
	}
	void dis()
	{
		System.out.println("the Average is "+avg);
	}
}

public class ObjectAvg
{
	public static void main(String[] args)
	{
		AVGdemo ob = new AVGdemo();
		ob.avg();
		ob.dis();
	}
}