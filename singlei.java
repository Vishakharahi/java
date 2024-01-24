class A
{
	int a,b,c;
}
class B extends A
{
	void f1()
	{
		a=10;
		b=20;
		c=30;
		if(a>b&&a>c)
		{
			System.out.println("max is a");
		}
		else if(b>a&&b>c)
		{
			System.out.println("max is b");
		}
		else
		{
			System.out.println("max is c");
		}
	}
	public static void main(String arc[])
	{
		B ob=new B();
		ob.f1();
	}
}