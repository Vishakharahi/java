import java.util.*;

class a
{
	int a;
	void setdata()
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the one no");
		a = sc.nextInt();
	}
}

class b extends a
{
	void fact()
	{
		int sum=1;
		for(int i=1;i<=a;i++)
		{
			sum=sum*i;
		}
		System.out.println(a+"factorial is"+sum);
	}
}

class c extends a
{
	void odd()
	{
		if(a%2==0)
		{
			System.out.println(a+"is Odd no");
		}
		else
		{
			System.out.println(a+"is Even no");
		}
	}
}

class k
{
	public static void main(String args[])
	{
		b ob1=new b();
		c ob2=new c();
		ob1.setdata();
		ob1.fact();
		ob2.setdata();
		ob2.odd();
	}
}