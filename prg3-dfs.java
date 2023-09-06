import java.util.Scanner;
class dfs
{
   int a[][]=new int[10][10];
   int stack[]=new int[10];
   int visited[]=new int[10];
   int fp[]=new int[10];
   int top,n,r,c;
   void input()
   {
      int st;
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the Total number of Vertices:");
      n=s.nextInt();
      for(int i=1;i<=n;i++)
      {
           for(int j=1;j<=n;j++)
           {
                System.out.print("The Edge from vertex "+i+" to vertex "+j+" is : ");
                a[i][j]=s.nextInt();
           }
      }
       System.out.println("The Adjacency Matrix Representation for the Graph is:");
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=n;j++)
               System.out.print(a[i][j]+"  ");
          System.out.println();
       }
       System.out.print("Enter the Starting vertex:");
       st=s.nextInt();
       stack[++top]=st;
       fp[++r]=st;
       visited[st]=1;
    }
    void logic()
    {
    System.out.print("The Back Edge for the given Graph is:");
           for(int i=top;i>0;i--)
      {
           for(int j=1;j<=n;j++)
           {
                if(++c>0 && a[stack[i]][j]==1 && visited[j]!=1)
                {
                    stack[++i]=j;
                    fp[++r]=j;
                    visited[j]=1;
                    j=0;
               }
        }
         System.out.print(stack[i]+"  ");
     }
       System.out.println();
    }
        void output()
        { 
        System.out.print("The Tree Edge for the given Graph is:");
         for(int i=1;i<=n;i++)
             System.out.print(fp[i]+"  ");
        System.out.println();
        System.out.println("The Basic Operation Count is:"+c);
         }
}
class depth
{
   public static void main(String args[])
   {
       dfs s=new dfs();
       s.input();  
       long l1=System.nanoTime();     
       s.logic();
       long l2=System.nanoTime();
       s.output();
       System.out.println("The Time Complexity is:"+(l2-l1));
    }
}   