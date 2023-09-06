public class WarshallAlgorithm {

    public static void main(String[] args) {
        int[][] graph = {{0, 1, 0, 0},
                         {0, 0, 1, 0},
                         {0, 0, 0, 1},
                         {1, 0, 0, 0}};
        int[][] closure = transitiveClosure(graph);
        printMatrix(closure);
    }
    
    public static int[][] transitiveClosure(int[][] graph) {
        int n = graph.length;
        int[][] closure = new int[n][n];
        
        // Initialize the closure matrix with the values from the input graph
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                closure[i][j] = graph[i][j];
            }
        }
        
        // Apply Warshall's algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    closure[i][j] = closure[i][j] | (closure[i][k] & closure[k][j]);
                }
            }
        }
        
        return closure;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
