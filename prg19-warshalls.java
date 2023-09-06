import java.util.Scanner;
public class WarshallAlgorithm {

	public static void main(String[] args) {
		int n, i, j;
		Scanner s = new Scanner(System.in);
	
		int[][] graph = new int[10][10];
		System.out.print("Enter the Total number of Vertices:");
		n = s.nextInt();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("The Edge from vertex " + i + " to vertex " + j + " is : ");
				graph[i][j] = s.nextInt();
			}
		}
		System.out.println("The Adjacency Matrix Representation for the Graph is:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				System.out.print(graph[i][j] + "  ");
			System.out.println();
		}
		int[][] closure = transitiveClosure(graph);
		printMatrix(closure,n);
	}

	public static int[][] transitiveClosure(int[][] graph) {
		int n = graph.length;
		int[][] closure = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				closure[i][j] = graph[i][j];
			}
		}

		
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					closure[i][j] = closure[i][j] | (closure[i][k] & closure[k][j]);
				}
			}
		}

		return closure;
	}

static void printMatrix(int[][] matrix,int n) {
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
