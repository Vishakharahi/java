class oc
{
	int a=5;
	void f1()
	{
		System.out.println("a is:"+a);
	}
	class ic
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
			for(i=1;i<=a;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(" "+i);
				}
				System.out.println(" ");
				
			}
			for(i=1;i<=a;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(" "+j);
				}
				System.out.println(" ");
				
			}
		}
	}
}
class nested
{
	public static void main(String arc[])
	{
		oc ob1=new oc();
		ob1.f1();
		oc.ic ob2=ob1.new ic();
		ob2.f2();
	}
}