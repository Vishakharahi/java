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
			int i,j,k,c,count=0;
			for(i=1;i<=a;i++)
			{
				for(k=5;k>=i;k--)
				{
					System.out.print(" ");
					count++;
				}
				for(j=1;j<=i;j++)
				{
					System.out.print(j);
					count++;
				}
				for(c=i-1;c>=1;c--)
				{
					System.out.print(c);
					count++;
				}
				System.out.println(" ");
				
			}
			System.out.println("count is:"+count);
		}
	}
}
class piramit
{
	public static void main(String arc[])
	{
		oc ob1=new oc();
		ob1.f1();
		oc.ic ob2=ob1.new ic();
		ob2.f2();
	}
}