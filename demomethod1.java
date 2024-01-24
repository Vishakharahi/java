class demomethod1
{
	void f1()
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println("sum is:"+c);
		f2();
	}
	void f2()
	{
		int a=10;
		int b=10;
		int c=a-b;
		System.out.println("sub is:"+c);
		f3();
	}
	void f3()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("mul is:"+c); 	
	}
	public static void main(String arc[])
	{
		demomethod1 ob1=new demomethod1();
		ob1.f1();
	}
}	
