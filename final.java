class A
{
	final int a=5;
	final void f1()
	{
		System.out.println("a is:"+a);
	}
}
class B extends A
{
	void f2()
	{
		int i,j,b=1;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(b++));
			}
			System.out.println(" ");
				
		}
			
	}
}
class final1
{
	public static void main(String arc[])
	{
		A ob1=new A();
		ob1.f1();
		B ob2=new B();
		ob2.f2();
	}
}