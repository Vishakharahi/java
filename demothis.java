class demothis
{
	int age;
	String name;
	void setdata(int age,String name)
	{
		this.age=age;
		this.name=name;
		this.f1();
	
	}
	void f1()
	{
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
	}
	public static void main(String arc[])
	{
		demothis ob=new demothis();
		ob.setdata(20,"vishakha");
	}

}