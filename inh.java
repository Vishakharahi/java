import java.util.*;
class A
{
	int no;
	Scanner sc=new Scanner(System.in);
	void setdata()
	{
		System.out.println("enter no:");
		no=sc.nextInt();
		
	}
}
class B extends A
{
	int i,a=1;
	void fact()
	{
		for(i=1;i<=no;i++)
		{
			a=a*i;
		}
		System.out.println("ans is:"+a);
	}
}
class C extends A
{
	void oddeven()
	{
		if(no/2==0)
		{
			System.out.println("no is even");
		}
		else
		{
			System.out.println("no is odd");
		}
	}
}
class inh
{
	public static void main(String arc[])
	{
		B ob1=new B();
		ob1.setdata();
		ob1.fact();
		C ob2=new C();
		ob2.setdata();
		ob2.oddeven();
	}
}
		
	
	