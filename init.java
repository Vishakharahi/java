class initfibo
{
	int a,b,c;
	void f1()
	{
		System.out.println("febonaci series");
		System.out.println(a);
		System.out.println(b);
	}
	void f2()
	{
		int i;
		for(i=0;i<5;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	{
		a=1;
		b=2;
	}
	public static void main(String arc[])
	{
		initfibo ob=new initfibo();
		ob.f1();
		ob.f2();
	}
}
	