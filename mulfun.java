import java.util.Scanner;
class multi
{
		int a,b,c;
		Scanner ob=new Scanner(System.in);
		void statement()
		{
			System.out.println("Enter value of a:");
			a=ob.nextInt();
			System.out.println("Enter value of b:");
			b=ob.nextInt();
		}
		void mul()
		{
			c=a*b;
			System.out.println("multification is:"+c);
		}
		public static void main(String a[])
		{
			multi obj=new multi();
			obj.statement();
			obj.mul();
		}
}
		
		
			