import java .util.Scanner;

class Floyd {
	final static int INF = 9999;
	

	void floydWarshall(int graph[][], int nV) {int c=0;

		Scanner s = new Scanner(System.in);

		int matrix[][] = new int[nV][nV];


		for (int i = 0; i < nV; i++) {
			for (int j = 0; j < nV; j++) {
				matrix[i][j] = graph[i][j];
			}
		}

long t1=System.nanoTime();
		for (int i = 0; i < nV; i++) {
			for (int j = 0; j < nV;  j++) {
				for (int k = 0; k < nV; k++) {
					c++;
					if (matrix[i][k] + matrix[k][j] < matrix[i][j])
						matrix[i][j] = matrix[i][k] + matrix[k][j];
				}
			}
		}
		long t2=System.nanoTime();
		System.out.println("The minimum path cost of the above graph is:");
		print(matrix, nV,c);
		System.out.println("Time complexity:"+(t2-t1));
	}

	void print(int matrix[][], int nV,int c) {
		for (int i = 0; i < nV; i++) {
			for (int j = 0; j < nV; j++) {
				if (matrix[i][j] == INF)
					System.out.print("INF ");
				else
					System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("Number of times Basic operation executed:"+c);
	}

	public static void main(String[] args) {
		int graph[][] = new int[10][10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of vertex:");
		int 	nV = s.nextInt();
		
	 for(int i=0;i<nV;i++ )
      {
      
      	for(int j=0;j<nV;j++)
      	{
      		System.out.println("the edge from vertex "+i+ " to vertex "+j);
      	graph[i][j]=(s.nextInt());
      	}
      }
      System.out.println("adjacency matrix representation");
      for(int i=0;i<nV;i++)   
      {
         for(int j=0;j<nV;j++)
         {
         	System.out.print(graph[i][j]);
         	System.out.print("  ");
         }
         System.out.println("");
      }
		Floyd a = new Floyd();
		a.floydWarshall(graph, nV);
	}
}