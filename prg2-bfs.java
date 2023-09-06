import java.io.DataInputStream;
import java.util.*;
class rumbo
{
	int front=0,rear=0;
	int queue[]=new int[10];
	rumbo(int queue[])
	{
		this.queue=queue;
	}
int push(int var)
{
    queue[rear] = var;
    rear++;
    return rear;
}
int  pop()
{
    queue[front] = 0;
    front++;
    return front;
}
}
	public class Main {
	public static void main(String[] args)throws Exception {
		int queue[]=new int[10];
		int graph[][]=new int[10][10];
		int front=0,rear=0;
int visited[] = new int[10];
DataInputStream d=new DataInputStream(System.in);
Scanner f=new Scanner(System.in);
    int N,i,j;
    System.out.println("enter total number of vertex");
    N=Integer.parseInt(d.readLine());
    long u=0;
      for(i=0;i<N;i++ )
      {
      visited[i]=0;
      	for(j=0;j<N;j++)
      	{
      		System.out.println("the edge from vertex "+i+ " to vertex "+j);
      	graph[i][j]=(f.nextInt());
      	}
      }
      System.out.println("adjacency matrix representation");
      for(i=0;i<N;i++)   
      {
         for(j=0;j<N;j++)
         {
         	System.out.print(graph[i][j]);
         	System.out.print("  ");
         }
         System.out.println("");
      }
         rumbo s=new rumbo(queue);
    int start,c=0;
    long k=System.nanoTime();
    System.out.println("enter starting vertex") ;
    start=Integer.parseInt(d.readLine());
    rear=s.push(start);
    visited[start-1] = 1; 
    System.out.println("the breadth traversal of the graph is :");
    while(front != rear)
    {
        int current = queue[front];
        
        System.out.println(current);
        front=s.pop();
 
        for(i=0;i<N;i++)
        {
            if((++c>0 && graph[current-1][i] == 1) && (visited[i] == 0))
            {
                visited[i] = 1;
                rear=s.push(i+1);
                //System.out.println(rear);
            }
        }
    }
        u=System.nanoTime();
    
        System.out.println("time complexity"+(u-k));
    System.out.println("no. of time basic operation executed"+c);
}
}