import java.util.Scanner;

class NQueen {
    int a[][] = new int[100][100];
    int n;
    static int count = 0;

    // Method to take input from the user
    void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = s.nextInt();
    }

    // Method to check if a queen can be placed at a given row and column
    int canPlace(int row, int col) {
        int i, j;

        // Check if there is a queen in the same row
        for (i = 0; i < n; i++) {
            if (a[row][i] == 1)
                return 0;
        }

        // Check if there is a queen in the upper left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (a[i][j] == 1)
                return 0;
        }

        // Check if there is a queen in the lower left diagonal
        for (i = row, j = col; i < n && j >= 0; i++, j--) {
            if (a[i][j] == 1)
                return 0;
        }

        // If no queen is found in the same row or diagonals, then the position is safe to place a queen
        return 1;
    }

    // Method to place queens on the board
    void placeQueens(int row) {
        // If all queens are placed, print the board
        if (row == n) {
            printBoard();
        } else {
            // Try placing a queen in each column of the current row
            for (int col = 0; col < n; col++) {
                if (canPlace(row, col) == 1) {
                    // Place the queen
                    a[row][col] = 1;

                    // Recursively place queens in the remaining rows
                    placeQueens(row + 1);

                    // Remove the queen (backtrack)
                    a[row][col] = 0;
                }
            }
        }
    }

    // Method to print the board
    void printBoard() {
        System.out.println("Solution " + (++count) + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Main {
    public static void main(String args[]) {
        NQueen q = new NQueen();
        q.input();
        q.placeQueens(0);
    }
}
