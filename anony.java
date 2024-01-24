class fact
{
	void f()
	{
	
	}
}
class main1
{
	public static void main(String arc[])
	{
		fact ob=new fact()
		{
			int n=5,sum=1,i;
			void f()
			{
				for(i=1;i<=n;i++)
				{
					sum=sum*i;
					
				}
				System.out.println("factorial is:"+sum);
			}
		};
		ob.f();
	}
}