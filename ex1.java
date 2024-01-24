class ex1
{
	public static void main(String arc[])
	{
		int a=10;
		int b=5;
		try{
			System.out.println("ans:"+a/b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("This is finally bloack");
		}
	}
	

}




