

import java.util.Arrays;

public class LargestElement {

    //// 1st approach using sorting ---- brute force approach
    static int largest(int arr[], int n) /// T.C. O(nlogn) S.C. O(1)
    {
        Arrays.sort(arr);
        return arr[n - 1];
    }

    /// 2nd approach optimal solution
    static int largest2(int arr[], int n) /// T.C. O(n)
    {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 755, 6, 8, 10, 127 };
        int n = arr.length;

        // Function call
        System.out.println("Largest element is "
                + largest(arr, n));
        System.out.println("Largest element is "
                + largest2(arr, n));
    }
}
