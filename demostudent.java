import java.util.Scanner;
class demostudent
{
	String name,p1;
	int age,p2;
	
	demostudent(String name1,int age1)
	{
		name=name1;
		age=age1;
	}
	demostudent(demostudent o)
	{
		p1=o.name;
		p2=o.age;
	}
	void dispalydata()
	{
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}
	void copydata()
	{
		System.out.println("p1 is:"+p1);
		System.out.println("p2 is:"+p2);
	}
	public static void main(String arc[])
	{
		int x;
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		n=sc.nextLine();
		System.out.println("Enter age");
		x=sc.nextInt();
		demostudent ob1=new demostudent(n,x);
		ob1.dispalydata();
		demostudent ob2=new demostudent(ob1);
		ob2.copydata();
	}
}