class A
{
	int a;
}
class B extends A
{
	int b;
}
class C extends B
{
	int c;
}
class D extends C
{
	int d;
}
class E extends D
{
	void f1()
	{
		a=1;
		b=2;
		c=3;
		d=4;
		int mul;
		mul=(a*b*c*d);
		System.out.println("mul is:"+mul);
	}
	public static void main(String arc[])
	{
		E ob=new E();
		ob.f1();
	}
}