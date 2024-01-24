import java.util.Scanner;
class max
{
	int maximum(int n1,int n2,int n3)
	{
		int i;
			if(n1>n2&&n1>n3)
			{
				return n1;
			}
			else if(n2>n1&&n2>n3)
			{
				return n2;
			}
			else
			{
				return n3;
			}
		
	}
	public static void main(String arc[])
	{
		int n1,n2,n3,ans1;
		Scanner sc=new Scanner(System.in);
		System.out.println("N1 is:");
		n1=sc.nextInt();
		System.out.println("N2 is:");
		n2=sc.nextInt();
		System.out.println("N3 is:");
		n3=sc.nextInt();
		max ob=new max();
		ans1=ob.maximum(n1,n2,n3);
		System.out.println("max is"+ans1);
		
	}
}
		