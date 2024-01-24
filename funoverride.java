import java.util.*;
class circle
{
	double aoc()
	{
		double pi=3.14,r=10;
		return pi*(r*r);
	}
}
class rectegle
{
	int aor()
	{
		int l=10,b=20;
		return (l*b);
	}
}
class tringle
{
	int aot()
	{
		int l=10,b=20;
		return (l*b)/2;
	}
}
class area
{
	public static void main(String arc[])
	{
		circle ob1=new circle();
		rectegle ob2=new rectegle();
		tringle ob3=new tringle();
		double ans1,ans2,ans3;
		ans1=ob1.aoc();
		System.out.println("circle is:"+ans1);
		ans2=ob2.aor();
		System.out.println("rectengle is:"+ans2);
		ans3=ob3.aot();
		System.out.println("tringle is:"+ans3);
	}
}