import java.util.*;

class Dij {
    int n, s;

    int a[][] = new int[30][30];

    int v[] = new int[20];
    int d[] = new int[20];

    void input() {
        int i, j;
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the no. of vertex:");
        n = s1.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i != j) {
                    System.out.print("weight of (" + i + "," + j + "):");
                    a[i][j] = s1.nextInt();
                    if (a[i][j] == 0) {
                        a[i][j] = 9999;
                    }
                } else {
                    a[i][j] = 0;
                }
            }
        }System.out.println("adjacency matrix is");
		for( i=0;i<n;i++)
		{
				for( j=0;j<n;j++)
				{
				
			System.out.print(a[i][j]+"   ");
				}
			System.out.println("");
				
		}
        System.out.print("enter the source vertex:");
        s = s1.nextInt();
    }

    void logic() {
        int path[][] = new int[10][10];
        int i, j, m, min, current;
        for (i = 1; i <= n; i++) {
            if (i == s) {
                d[i] = 0;
            } else {
                d[i] = 9999;
            }
            v[i] = 0;
            path[i][1] = s;
            for (j = 2; j <= n; j++) {
                path[i][j] = -1;
            }
        }

        current = s;

        v[s] = 1;

        for (i = 1; i < n; i++) {

            for (j = 1; j <= n; j++) {
                if (v[j] == 0) {
                    if (a[current][j] != 9999) {
                        m = d[current] + a[current][j];
                        if (d[j] > m) {
                            d[j] = m;

                            int k;

                            for (k = 1; k <= n; k++) {
                                path[j][k] = path[current][k];
                            }

                            for (k = 2; k <= n && path[j][k] != -1; k++) {
                            }

                            path[j][k] = j;
                        }
                    }
                }
            }

            min = 9999;
            m = current;
            for (j = 1; j <= n; j++) {
                if (v[j] == 0) {
                    if (d[j] < min) {
                        min = d[j];
                        m = j;
                    }
                }
            }

            if (min != 9999) {
                current = m;
                v[m] = 1;
            } else {
                break;
            }
        }

        System.out.println("Distance :");
        for (i = 1; i <= n; i++) {
            System.out.println("Vertex=" + i + " " + d[i]);
        }

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n && path[i][j] != -1; j++) {
                System.out.print(path[i][j]);
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String ar[]) {
        Dij k = new Dij();
        k.input();
        k.logic();
    }
}
