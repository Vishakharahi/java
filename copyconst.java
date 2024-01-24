class copyconst
{
	int no,c;
	copyconst()
	{
		no=100;
	}
	copyconst(copyconst ob)
	{
		c=ob.no;
	}
	void c1()
	{
		System.out.println("no is"+no);
	}
	void c2()
	{
		System.out.println("copy no is"+c);
	}
	public static void main(String arc[])
	{
		copyconst ob1=new copyconst();
		ob1.c1();
		copyconst ob2=new copyconst(ob1);
		ob2.c2();
	}
}
	