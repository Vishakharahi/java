interface i1
{ 
	void pelindrom(int n1);
}
interface i2 extends i1
{
	void armstroge(int n1);
}
class demo1 implements i2
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
	public void armstroge(int n1)
	{
		int n2;
		n2=n1;
		int r,sum=0;
		while(n1>0)
		{
			r=n1%10;
			sum=sum+(r*r*r);
			n1=n1/10;
		}
		if(n2==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not");
		}
	}
	public static void main(String arc[])
	{
		demo1 ob=new demo1();
		ob.pelindrom(121);
		ob.armstroge(153);
	}
}