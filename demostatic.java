class demostatic
{
	int no1=10;
	static int no2=20;
	void f1()
	{
		System.out.println("no1 is:"+no1);
		System.out.println("no2 is:"+no2);
	}
	public static void main(String a[])
	{
		demostatic ob1=new demostatic();
		ob1.no1=100;
		ob1.no2=200;
		demostatic ob2=new demostatic();
		ob2.no1=1000;
		ob2.no2=2000;
		demostatic ob3=new demostatic();
		ob3.no1=10000;
		ob3.no2=20000;
		ob1.f1();
		ob2.f1();
		ob3.f1();
	}
}
		
		
		