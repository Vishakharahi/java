import java.util.*;
class checkage extends Exception
{
	checkage(String str)
	{
		super(str);
	}
	
}
class demo2
{
	public static void main(String arc[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new checkage("age is not valid for voting");
			}
			else
			{
				System.out.println("age is valid");
			}
		}
		catch(checkage e)
		{
			System.out.println(e);
		}
	}
}
