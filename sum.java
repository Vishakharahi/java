class sum
{
	int a=10,b=20,c;
	void sum()
	{
		c=a+b;
		System.out.println("sum is"+ c);
	}
	public static void main(String a[])
	{
		sum o = new sum();
		o.sum();
		o.a=100;
		o.sum();
	}
}