import java.util.*;
class A
{
	void setdata()
	 {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
	}
	void add()
	{
		setdata();
		ans=a+b;
	}
}
class B extends A
{
}
class C extends A
{
	int ans;
	void d1()
	{
		ans=super.add();
		System.out.println("Ans is:"+ans);
	}
}
class inh1
{
	public static void main(String arc[])
	{
		C ob=new C();
		ob.d1();
	}
	
}
		