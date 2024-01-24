import java.util.*;
class checkptt extends Exception
{
	checkptt(String str)
	{
		super(str);
	}
	
}
class demo3
{
	public static void main(String arc[])
	{
		int no;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		try
		{
			if(no>5)
			{
				throw new checkptt("no is grater then no");
			}
			else
			{
				int i,j,k,c,count=0;
				for(i=1;i<=no;i++)
				{
					for(k=5;k>=i;k--)
					{
						System.out.print(" ");
					}
					for(j=1;j<=i;j++)
					{
						System.out.print(j);
					}
					for(c=i-1;c>=1;c--)
					{
						System.out.print(c);
					}
					System.out.println(" ");
				
				}
			}
		}
		catch(checkptt e)
		{
			System.out.println(e);
		}
	}
}