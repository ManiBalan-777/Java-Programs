import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws Exception {
		int n,m,i,j,k,c=0;
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first string:");
		String s1=s.nextLine();
		System.out.println("enter the second string:");
		String s2=s.nextLine();
		n=s1.length();
		m=s2.length();
		long t1=System.nanoTime();
		if(n>m)
		{
		for(i=0;i<n;i++)
		{
			for( j=0,b=i;j<k&&b<n;j++)
			{
				c++;
				if(s1.charAt(b)==s2.charAt(j))
				k++;
				else 
				break;
			}
			if(j==m)
			break;
		}
		t2=System.nanoTime();
		if(i<n)
		System.out.println("string pattern matching ");
		else
		System.out.println("string pattern not matching");
		}
		else
		System.out.println("not exist");
		System.out.println("number of times basic operation executed"+c);
		System.out.println("time complexity is"+(t2-t1));
		
		
	}
	
}