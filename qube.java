import java.util.*;

class a
{
	int a=30;
}

class b extends a
{
	int a=20,sq=0,tb=0;
	void cal()
	{
		sq=super.a*super.a;
		qube=a*a*a;
		System.out.println("Squar is :"+sq);
		System.out.println("Qube is :"+qube);	
	}
}
	void setdata()
	{
		sc = new  Scanner(System.in);
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

class qube
{
	public static void main(String args[])
	{
		b ob1=new b();
		ob1.fact();
	}
}