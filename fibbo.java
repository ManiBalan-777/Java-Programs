import java.util.*;
class main
{
	public static void main(String ar[])
	{
		System.out.println("enter the number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=-1;b=1;c;
		for(int i=0;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
}
		