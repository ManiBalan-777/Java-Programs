import java.util.*;
class main
{
	public static void main(String ar[])
	{
		System.out.println("enter the number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=1;
		for(int i=0;i<n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of the given number is "+f);
	}
}
		