// Peak Element - An element is considered to be a peak element if it is strictly greater than its adjacent elements. 
// If there are multiple peak elements, return the index of any one of them.

// [Naive Approach] Using Linear Search - O(n) Time and O(1) Space
// [Expected Approach] Using Binary Search - O(logn) Time and O(1) Space

public class PeakElement {
   public static int peakElement(int[] arr) {
        int n = arr.length;

        // If there is only one element, then it's a peak
        if (n == 1)
            return 0;

        // Check if the first element is a peak
        if (arr[0] > arr[1])
            return 0;

        // Check if the last element is a peak
        if (arr[n - 1] > arr[n - 2])
            return n - 1;

        // Search Space for binary Search
        int lo = 1, hi = n - 2;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // If the element at mid is a  
            // peak element return mid
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return mid;

            // If next neighbor is greater, then peak
            // element will exist in the right subarray
            if (arr[mid] < arr[mid + 1])
                lo = mid + 1;

            // Otherwise, it will exist in left subarray
            else
                hi = mid - 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(peakElement(arr));
    }
}

