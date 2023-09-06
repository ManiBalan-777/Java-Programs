import java.util.Scanner;

public class DivideAndConquerMinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int min = findMin(arr, 0, n - 1);
        int max = findMax(arr, 0, n - 1);
        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }

    public static int findMin(int[] arr, int low, int high) {
        // base case: if there is only one element
        if (low == high) {
            return arr[low];
        }

        // if there are two elements
        if (high == low + 1) {
            return Math.min(arr[low], arr[high]);
        }

        // divide the array into two halves
        int mid = (low + high) / 2;
        int leftMin = findMin(arr, low, mid);
        int rightMin = findMin(arr, mid + 1, high);

        // find the minimum of the two halves
        return Math.min(leftMin, rightMin);
    }

    public static int findMax(int[] arr, int low, int high) {
        // base case: if there is only one element
        if (low == high) {
            return arr[low];
        }

        // if there are two elements
        if (high == low + 1) {
            return Math.max(arr[low], arr[high]);
        }

        // divide the array into two halves
        int mid = (low + high) / 2;
        int leftMax = findMax(arr, low, mid);
        int rightMax = findMax(arr, mid + 1, high);

        // find the maximum of the two halves
        return Math.max(leftMax, rightMax);
    }
}