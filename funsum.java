class demosum
{
	int a,b,ans;
	int sum()
	{
		a=100;
		b=50;
		ans=a+b;
		return ans;
	}
	public static void main(String a[])
	{
		int ans1;
		demosum ob=new demosum();
		ans1=ob.sum();
		System.out.println("Sum is:"+ans1);
	}
}
		