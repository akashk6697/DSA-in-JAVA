
// Java program to count occurrence of a given target
// using binary search


// [Naive Approach] Using Linear Search – O(n) Time and O(1) Space
// [Expected Approach] Using Binary Search – O(logn) Time and O(1) Space


class NumberOfOccurrence {

    // Function to return Lower Bound
    static int lowerBound(int[] arr, int target) {
        int res = arr.length;
        
        // Search space for binary search
        int lo = 0, hi = arr.length - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                res = mid;
                hi = mid - 1;
            } 
              else {
                lo = mid + 1;
            }
        }
        return res;
    }

    // Function to return Upper Bound
    static int upperBound(int[] arr, int target) {
        int res = arr.length;
        
        // Search space for binary search
        int lo = 0, hi = arr.length - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                res = mid;
                hi = mid - 1;
            } 
              else {
                lo = mid + 1;
            }
        }
        return res;
    }

    static int countFreq(int[] arr, int target) {
      
        // Return the difference between upper
        // bound and lower bound of the target
        return upperBound(arr, target) - 
                                  lowerBound(arr, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;
        System.out.println(countFreq(arr, target));
    }
}