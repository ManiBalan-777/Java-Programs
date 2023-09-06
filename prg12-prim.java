import java.util.*;
class dream{
void Prim(int G[][], int n) {
		int INF = 999;
		int edge,c=0,k=0,start=0;
		int a[]=new int[10];
		int[] selected = new int[n];
		for(int i=0;i<n;i++)
		selected[i]=0;
		edge = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the starting vertex");
		start=s.nextInt();
		selected[start] = 1;	
		System.out.println("enter the edge weights");
		long h=System.nanoTime();
		int min=0;
         while (edge < n-1) {
	    	min = INF;
			int x = 0; 
			int y = 0; 
			for (int i = 0; i < n; i++) {
				if (selected[i] == 1) {
					for (int j = 0; j < n; j++) {
						if (selected[j]==0&& G[i][j] != 0) {
							if (min > G[i][j]) 
							{
								min = G[i][j];
								x = i;
								y = j;
							}
						}
					}
				}
			}
			a[k++]=min;
			System.out.println(x + " --" + y + " :  " + G[x][y]);
			selected[y] = 1;
			edge++;
         }
			System.out.println("total path cost is");
			int bi=0;
			//System.out.println("min"+min);
			for(int i=0;i<n-1;i++)
			bi=bi+a[i];
			System.out.println(bi);
			long t=System.nanoTime();
		System.out.println("time complexity is"+(t-h));
	}
}
class frol
{
	public static void main(String[] args) {
		dream g = new dream();
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter n");
		n=s.nextInt();
		int G[][]= new int[10][10];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
					System.out.println("edge from vertex "+i+" to vertex "+j);
			G[i][j]=s.nextInt();
			}
		}
		System.out.println("adjacency matrix is");
		for(int i=0;i<n;i++)
		{
				for(int j=0;j<n;j++)
				{
				
			System.out.print(G[i][j]+"   ");
				}
			System.out.println("");
				
		}
	g.Prim(G,n);
	}
}