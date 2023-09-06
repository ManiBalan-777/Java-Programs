import java.io.*;
class insert
{
	int a[ ]=new int[10];
	int n;
	void input()throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("entet n:");
		n=Integer.parseInt(d.readLine());
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
		a[i]=Integer.parseInt(d.readLine());
	}
	void logic()throws Exception
	{
		int i,j,count=0,c;
		for(i=1;i<n;i++)
		{
			c=a[i];
			for(j=i-1;j>=0&&c<a[j]&&++count>0;j--)
			{
				a[j+1]=a[j];
				
			}
			a[j+1]=c;
		
		}
			System.out.println("count:"+count);
	}
	void output()
	{
		int i;
			System.out.println("sorted array:");
		for(i=0;i<n;i++)
		System.out.println(a[i]);
	}
	}
public class Main {
	public static void main(String[] args)throws Exception {
		insert h=new insert();
		h.input();
		h.logic();
		h.output();
		
	}
}