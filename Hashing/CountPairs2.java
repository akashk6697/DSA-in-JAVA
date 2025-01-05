
// Java program to count pairs with sum less 
// than target using two pointers technique

// [Naive Approach] – By Generating all the pairs- O(n^2) Time and O(1) Space
// [Better Approach] – Using Binary Search – O(2*nlogn) Time and O(1) Space
// [Expected Approach] – Using Two Pointers Technique – O(n*logn+n) Time and O(1) Space

import java.util.Arrays;
public class CountPairs2 {
    static int countPairs(int[] arr, int target) {
      
        // Sort the array to use two pointer technique
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int cnt = 0;

        // Two pointer technique
        while (left < right) {
            int sum = arr[left] + arr[right];

            // If the sum is less than target, then arr[left] 
            // will form a valid pair with every element 
            // from index left + 1 to right.
            if (sum < target) {
                cnt += right - left;
                left++;
            } 
              else {
                right--;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 8, 3, 4, 7, 6, 5 };
        int target = 7;
        System.out.println(countPairs(arr, target));
    }
}