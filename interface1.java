interface a1
{
	void fectorial(int no);
}
interface a2 extends a1
{
	void fibo();
}
class demo1 implements a2
{
	public void fectorial(int no)
	{
		int i,ans=1;
		for(i=1;i<=no;i++)
		{
			ans=ans*i;
		}
		System.out.println("ans is:"+ans);
	}
	public void fibo(int no)
	{
		int i,ans=1;
		for(i=1;i<=no;i++)
		{
			ans=ans+i;
		}
		System.out.println("ans is:"+ans);
	}
	public static void main(String arc[])
	{
		demo1 ob=new demo1();
		ob.fectorial(5);
		ob.fibo(5);
	}
}

