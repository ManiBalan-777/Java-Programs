import java.util.Scanner;

class NQueen {
	int[][] board;
	int n;
	int count;

	public NQueen() {
		board = new int[100][100];
		count = 0;
	}

	// Prompt user for board size
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the board: ");
		n = scanner.nextInt();
		if (n == 2 || n == 1 || n == 3) {
			System.out.println("tgere is no solution for " + n + "queen problem");
		}
	}
	// Check if it is safe to place a queen at position (row, col)
	public int canPlaceQueen(int row, int col) {
		int i, j;

		// Check for queens in the same row
		for (i = 0; i < col; i++) {
			if (board[row][i] == 1) {
				return 0;
			}
		}

		// Check for queens in the upper diagonal
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return 0;
			}
		}

		// Check for queens in the lower diagonal
		for (i = row, j = col; i < n && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return 0;
			}
		}

		return 1;
	}

	// Recursive function to place queens on the board
	public void placeQueens(int col) {
		if (col == n) {
			// All queens have been placed, print the board
			printBoard();
			return;
		}

		for (int i = 0; i < n; i++) {
			if (canPlaceQueen(i, col) == 1) {
				board[i][col] = 1;
				placeQueens(col + 1);
				board[i][col] = 0; // backtrack
			}
		}
	}

	// Print the current board configuration
	public void printBoard() {
		System.out.println("\nSolution " + (++count) + ":");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1)
					System.out.print("Q" + "	");
				else
					System.out.print("-" + "	");
				//  System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}

public class paul {
	public static void main(String[] args) {
		NQueen s = new NQueen();
		long t1=System.nanoTime();
		s.input();
		s.placeQueens(0);
		long t2=System.nanoTime();
		System.out.println("time complexity"+(t2-t1));
	}
}
