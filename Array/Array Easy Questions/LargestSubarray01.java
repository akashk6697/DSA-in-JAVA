// Java program to find the longest subarray with an equal
// number of 0's and 1's using HashMap and Prefix Sum
import java.util.HashMap;

public class LargestSubarray01 {

    // Function to find the length of the longest subarray
    public static int maxLen(int[] arr) {
        // HashMap to store prefix sums and their earliest occurrences
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        int prefixSum = 0; // Initialize prefix sum
        int maxLength = 0; // Result to store the maximum length

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Update prefix sum (treat 0 as -1)
            prefixSum += (arr[i] == 0) ? -1 : 1;

            // If prefix sum is zero, update the maximum length
            if (prefixSum == 0) {
                maxLength = i + 1;
            }

            // If the prefix sum is already in the map, calculate subarray length
            if (prefixSumMap.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(prefixSum));
            } else {
                // Otherwise, store the current prefix sum with its index
                prefixSumMap.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1};

        // Print the length of the longest subarray
        System.out.println("Length of the longest subarray with equal 0s and 1s: " + maxLen(arr));
    }
}
