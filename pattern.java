class patt
{
	int i,j,k;
	void pattern()
	{
		for(i=1;i<=3;i++)
		{
			for(k=0;k>=i;k--)
			{
				System.out.print(" ");
			}
				
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String a[])
	{
		patt obj=new patt();
		obj.pattern();
	}
}