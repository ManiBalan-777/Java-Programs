import java.util.Scanner;
class n_queen
{
int a[][]=new int[100][100];
int n;
static int count=0;
void input()
{
 Scanner s=new Scanner(System.in);
  System.out.println("enter the n:");
  n=s.nextInt();
}
int check(int r, int c)
{
   int i,j;
   for(i=0; i<n ; i++)
   {
              if(a[r][i]==1)
                  return 0;
   }
   for(i=r, j=c; i>=0 && j>=0 ; i--, j--)
   {
              if(a[i][j]==1)
                  return 0;
   }
   for(i=r, j=c; i<n && j>=0 ; i++, j--)
   {
              if(a[i][j]==1)
                  return 0;
   }
return 1;

}
void logic(int r,int c)
{int i;
         if(c==n)
	{
           output();
	}
else
{
      for(i=0;i<n;i++)
       {
       
       if(check(i,c)==1)
         {
           a[i][c]=1;
           logic(i, c+1);
	  a[i][c] = 0;
        
	}
	}
}             
}
void output()
{
System.out.println("Solution :"+ (++count));
 for(int i=0;i<n;i++) 
  {
   for(int j=0;j<n;j++)
     {
      if(a[i][j]==1)
       System.out.print("Q"+" ");
      else
       System.out.print("-"+" ");
  }  
 System.out.println();     
}
}
}
class q
{
 public static void main(String args[])
 {
   n_queen v=new n_queen();
   v.input();
   v.logic(0,0);
 }
}
