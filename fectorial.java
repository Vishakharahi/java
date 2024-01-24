import java.util.Scanner;
class factorial
{
	int fact(int no)
	{
		int i,ans=1;
		for(i=1;i<=no;i++)
		{
			ans=ans*i;
		}
		return ans;
	}
	public static void main(String arc[])
	{
		int no;
		int ans1;
		Scanner sc=new Scanner(System.in);
		System.out.println("No is:");
		no=sc.nextInt();
		factorial ob=new factorial();
		ans1=ob.fact(no);
		System.out.println(no+"fectorial is"+ans1);
		
	}
}
		