abstract class A
{
	abstract void f1(int no);
}
class dabstract extends A
{
	public void f1(int no)
	{
		int i;
		int fact=1;
		for(i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is:"+fact);
	}
	public static void main(String arc[])
	{
		dabstract ob=new dabstract();
		ob.f1(5);
	}
}