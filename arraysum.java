class sumarray
{
	public static void main(String a[])
	{
		int arr[]=new int[5];
		int i,sum=0;
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			sum=sum+arr[i];
		}
		System.out.println("sum is"+sum);
	}
}