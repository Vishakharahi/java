abstract class A
{
	abstract void pelindrom(int n1);
}
class dabstract extends A
{

	public void pelindrom(int n1)
	{
		int n2;
		n2=n1;
		int r,sum=0;
		while(n1>0)
		{
			r=n1%10;
			sum=(sum*10)+r;
			n1=n1/10;
		}
		if(n2==sum)
		{
			System.out.println("pelindrom");
		}
		else
		{
			System.out.println("not");
		}
	}
	public static void main(String arc[])
	{
		dabstract ob=new dabstract();
		ob.pelindrom(12);
	}
}