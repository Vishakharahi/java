import java.util.Scanner;
class pelindrom
{
	int n1;
	Scanner sc=new Scanner(System.in);
	void enterdata()
	{
		System.out.println("Enter no:");
		n1=sc.nextInt();
	}
	void displaydata()
	{
		//this.enterdata();
		System.out.println("no is:"+n1);
	}
	void pelindrom()
	{
		int n2;
		n2=n1;
		int r,sum=0;
		while(n1>0)
		{
			r=n1%10;
			sum=(sum*10)+r;
			n1=n1/10;
		}
		if(n2==sum)
		{
			System.out.println("pelindrom");
		}
		else
		{
			System.out.println("not");
		}
			
	}
	public static void main(String arc[])
	{
		pelindrom ob=new pelindrom();
		ob.enterdata();
		ob.displaydata();
		ob.pelindrom();
		
	}
}