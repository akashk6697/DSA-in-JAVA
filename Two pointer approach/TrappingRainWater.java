// Trapping Rainwater Problem states that given an array of n non-negative integers arr[] representing
//  an elevation map where the width of each bar is 1, compute how much water it can trap after rain.

// [Naive Approach] Find left and right max for each index - O(n^2) Time and O(1) Space
// [Better Approach] Prefix and suffix max for each index - O(n) Time and O(n) Space
// [Expected Approach] Using Two Pointers - O(n) Time and O(1) Space
// [Alternate Approach] Using Stack - O(n) Time and O(n) Space

// The expected approach uses two pointers to solve the problem. The idea is to find the maximum height of the left and right sides of the current index.

public class TrappingRainWater {
   
   public static int maxWater(int[] arr) {
        int left = 1;
        int right = arr.length - 2;

        // lMax : Maximum in subarray arr[0..left-1]
        // rMax : Maximum in subarray arr[right+1..n-1]
        int lMax = arr[left - 1];
        int rMax = arr[right + 1];

        int res = 0;
        while (left <= right) {
          
            // If rMax is smaller, then we can decide the amount of water for arr[right]
            if (rMax <= lMax) {
              
                // Add the water for arr[right]
                res += Math.max(0, rMax - arr[right]);

                // Update right max
                rMax = Math.max(rMax, arr[right]);

                // Update right pointer as we have decided the amount of water for this
                right -= 1;
            } else { 
              
                // Add the water for arr[left]
                res += Math.max(0, lMax - arr[left]);

                // Update left max
                lMax = Math.max(lMax, arr[left]);

                // Update left pointer as we have decided water for this
                left += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(maxWater(arr));
    }
}

