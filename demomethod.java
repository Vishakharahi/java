class demomethod
{
	void m1()
	{
		System.out.println("welcome");
	}
	void m2()
	{
		m1();
		System.out.println("home");
	}
	public static void main(String arc[])
	{
		demomethod ob1=new demomethod();
		ob1.m2();
	}
}