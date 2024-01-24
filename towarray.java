class towarray
{
	public static void main(String a[])
	{
		int arr[][]=new int[3][3];
		int i,j;
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(i==j)
				{
					System.out.print(arr[i][j]);
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}