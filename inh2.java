import java.util.*;
class A
{
	int no;
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("no is:");
		no=sc.nextInt();
	}
}
class B extends A
{
	
	void sqr()
	{
		setdata();
		System.out.println("sqr is:"+(super.no*no));
	}
}
class C extends A
{
	void cub()
	{
		setdata();
		System.out.println("cub is:"+(super.no*no*no));
	}
}
class inh2
{
	public static void main(String arc[])
	{
		B ob1 = new B();
		ob1.sqr();
		C ob2 = new C();
		ob2.cub();
	}
}
	
