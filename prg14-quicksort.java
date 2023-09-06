import java.io.*;
import java.util.*;
class quicksort
{
   int i,j,t,c;
   void divide(int a[],int start,int end)
   {
         if(start<end)
         {
               j=partition(a,start,end);
              divide(a,start,j-1);
              divide(a,j+1,end);    
         }
  }
  int partition(int a[],int start,int end)
  {
     int p=a[start];
     i=start;
     j=end;
     while(i<j)
     {
     while(++c>0 && a[i]<=p && i<=end)
           i++;
     while(++c>0 && a[j]>=p && j>start)
          j--;
     if(i<j)
     {
         t=a[i];
         a[i]=a[j];
         a[j]=t;
      }
     }
     t=a[start];
     a[start]=a[j];
     a[j]=t;
     return j;
   }  
     void print(int a[],int n)
     {
          System.out.println("The Sorted elements are:");
          for(i=0;i<n;i++)
              System.out.println(a[i]);
          System.out.println("The Basic Operation is:"+c);
     }
}
class quick
{
    public static void main(String args[])throws Exception
    {
       int a[]=new int[201];
      int n,end,start=0;
      DataInputStream d=new DataInputStream(System.in);
       System.out.print("Enter the Limit:");
       n=Integer.parseInt(d.readLine());
       end=n-1;
       System.out.println("The Elements are:");
       for(int i=0;i<n;i++)
       {
            a[i]=i;
            System.out.println(a[i]);
       }
        quicksort q=new quicksort();
        long l1=System.nanoTime();
        q.divide(a,start,end);
        long l2=System.nanoTime();
        q.print(a,n);
        System.out.println("The Time Complexity is:"+(l2-l1));
    }
}
       