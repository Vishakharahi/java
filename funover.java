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
	void aor(int l,int b)
	{
		System.out.println("rectengle is:"+(l*b));
	}
}
class tringle
{
	int aot(int l,int b)
	{
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
		double ans1;
		double ans2;
		ans1=ob1.aoc();
		System.out.println("circle is:"+ans1);
		ob2.aor(10,20);
		ans2=ob3.aot(10,20);
		System.out.println("tringle is:"+ans2);
	}
}