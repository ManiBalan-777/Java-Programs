import java.io.*;
import java.util.*;
class merge_sort
{
   int i,c1;
   void divide(int a[],int start,int end)
   {
         if(start<end)
         {
              int mid=(start+end)/2;
              divide(a,start,mid);
              divide(a,mid+1,end);
              combine(a,start,mid,end);
         }
  }
  void combine(int a[],int start,int mid,int end)
  {
       int k=0,j;
       int c[]=new int[201];
       i=start;
       j=mid+1;
       while(i<=mid && j<=end)
       {
            c1++;
            if(a[i]<a[j])
               c[k++]=a[i++];
            else
                c[k++]=a[j++];
       }
       while(i<=mid)
           c[k++]=a[i++];
       while(j<=end)
           c[k++]=a[j++];
       for(i=start,k=0;i<=end;i++,k++)
            a[i]=c[k];
   }  
     void print(int a[],int n)
     {
          System.out.println("The Sorted elements are:");
          for(int i=0;i<n;i++)
              System.out.println(a[i]);
          System.out.println("The Basic Operation is:"+c1);
     }
}
class merge
{
    public static void main(String args[])throws Exception
    {
       int a[]=new int[201];
      int n,end,start=0;
      DataInputStream d=new DataInputStream(System.in);
       System.out.print("Enter the Limit:");
       n=Integer.parseInt(d.readLine());
       Random r=new Random();
       end=n-1;
       System.out.println("The Elements are:");
       for(int i=0;i<n;i++)
       {
            a[i]=r.nextInt(100);
            System.out.println(a[i]);
       }
        merge_sort m=new merge_sort();
        long l1=System.nanoTime();
        m.divide(a,start,end);
        long l2=System.nanoTime();
        m.print(a,n);
        System.out.println("The Time Complexity is:"+(l2-l1));
    }
}
       