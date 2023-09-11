import java.io.DataInputStream;
class main
{
   public static void main(String args[]) throws Exception
   {
       DataInputStream d=new DataInputStream(System.in);
       System.out.println("enter the a:");
       int a=Integer.parseInt(d.readLine()); 
        System.out.println("enter the b:");
       int b=Integer.parseInt(d.readLine()); 
        int temp=0;
        while(b!=0)
         {
           temp=b;
           b=a%b;
           a=temp;  
         }
         System.out.println("gcd of number is"+a);
    }
}