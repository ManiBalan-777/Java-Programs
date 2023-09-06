import java.io.*;
import java.util.*;
class quicksort {
	int i, j, t, o, c;
	int divide(int a[], int start, int end, int n, int k) {
		if (start < end) {
			j = partition(a, start, end, n);
			if (j == k - 1)
				o = j;
			if (j > k - 1)
				divide(a, start, j - 1, n, k);
			else
				divide(a, j + 1, end, n, k);
		}
		return j;
	}
	int partition(int a[], int start, int end, int n) {
		int p;

		Random g = new Random();
		int w = g.nextInt(n - 1);
		p = start + (w % (end - start + 1));


		t = a[p];
		a[p] = a[start];
		a[start] = t;

		p = a[start];
		i = start;
		j = end;
		while (i <= j) {
			while (++c > 0 && a[i] <= p && i <= end)
				i++;
			while (++c > 0 && a[j] >= p && j > start)
				j--;
			if (i < j) {
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		t = a[start];
		a[start] = a[j];
		a[j] = t;
		return j;
	}
	void print(int a[], int n ,int k)
	{
		System.out.println("The number of times the  Basic Operation is executed:" + c);
	}
}
class quick {
	public static void main(String args[])throws Exception {
		int a[] = new int[201];
		int n, end, start = 0, k = 0, j, i;
		DataInputStream d = new DataInputStream(System.in);
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		n = Integer.parseInt(d.readLine());
		end = n - 1;




		System.out.println("The Elements are:");
		Random r = new Random();
		for (i = 0; i < n; i++) {
			a[i] = r.nextInt(100);
			System.out.println(a[i]);
		}

		quicksort q = new quicksort();
		long l1 = System.nanoTime();
		q.divide(a, start, end, n, k);
		System.out.println("The Sorted elements are:");
		for (i = 0; i < n; i++)
			System.out.println(a[i]);
		System.out.println("Enter which  smallest element you want?");
		k = s.nextInt();
		if (k > n)
			System.out.println("---we cannot find the solutio because k value is bigger than n value---");
		else {
				System.out.println("The"+k+" th smallest element which you want in the above array are" + a[k - 1]);
			q.print(a, n, k);
			long l2 = System.nanoTime();
			System.out.println("The Time Complexity is:" + (l2 - l1));
		}
	}
}
