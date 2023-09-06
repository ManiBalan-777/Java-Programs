import java.util.*;
class rcb 
{
		int min,max;
		void divide(int a[],int start, int end) 
		{
			int m,m1,mid;
			if (start == end) {
				min = a[start];
				max = a[start];
			} else {
				mid = (start + end) / 2;
				divide(a, start, mid);
				m = min;
				m1 = max;
				divide(a, mid + 1, end);
				if (m < min)
				 min=m;
				if(m1>max)
				 max=m1;
			}
		}
		void output()
		{
		System.out.println("minimum"+min);
		System.out.println("maximum"+max);
		}
}

class dream {
	public static void main(String args[]) {
		rcb x = new rcb();
        Scanner s = new Scanner(System.in);
		int a[] = new int[30];
		int n;
		System.out.println("enter n");
		n = s.nextInt();
		System.out.println("enter an array");
		for (int i = 0; i < n; i++)
		{
			System.out.println("enter an element");
			a[i] = s.nextInt();
		}
		x.divide(a,0,n-1);
		x.output();
	}
}