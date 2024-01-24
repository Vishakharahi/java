class demothis1
{
	demothis1()
	{
		this(10,20);
		//System.out.println("defualt constrsctor");
	}
	demothis1(int x,int y)
	{
		//using three variable swap
		//int tmp;
		//tmp=x;
		//x=y;
		//y=tmp;
		
		//using two variable swap
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x is:"+x);
		System.out.println("y is:"+y);
	}
	public static void main(String arc[])
	{
		demothis1 ob=new demothis1();
	}
}