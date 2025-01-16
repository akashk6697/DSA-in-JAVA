package Array;

//// Majority Element --- Given an array A of N elements. Find the majority element in the array. A majority
// element in an array A of size N is an element that appears strictly more than N/2 times in the array.
 //// I/P -- N = 3 A[] = {1,2,3} 
 ///// O/P --- -1

//  Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
//  Output : 4



import java.util.Arrays;

public class MajorityElement {
    public static int findMajorityElement(int[] arr, int n) {
        if (n == 0) {
            return -1; // Handle edge case where the array is empty
        }
        Arrays.sort(arr); // Step 1: Sort the array
        int count = 1, maxCount = 1; // Initialize count variables
        int majorityElement = arr[0]; // Assume the first element is the majority

        // Step 2: Traverse the sorted array
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++; // Increment count for consecutive elements
            } else {
                count = 1; // Reset count for a new element
            }

            // Update maxCount and majorityElement if a higher count is found
            if (count > maxCount) {
                maxCount = count;
                majorityElement = arr[i];
            }
        }

        // Step 3: Check if maxCount is greater than n / 2
        if (maxCount > n / 2) {
            return majorityElement; // Return the majority element
        } else {
            return -1; // Return -1 if no majority element exists
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = arr.length;

        int result = findMajorityElement(arr, n);
        if (result != -1) {
            System.out.println("The majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }
}


 
 