
// 1 [Naive Approach] Using Nested Loop – O(n^2) Time and O(1) Space
// 2 [Better Approach] Prefix Sum and Suffix Sum Array – O(n) Time and O(n) Space
// 3 [Expected Approach] Running Prefix Sum and Suffix Sum – O(n) Time and O(1) Space
public class EquilibriumPoint {
    // Naive Approach: Using Nested Loop – O(n^2) Time and O(1) Space
    static int equilibrium(int arr[], int n)
    {
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum
 
        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += arr[i];
 
        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index
                           // i
 
            if (leftsum == sum)
                return i;
 
            leftsum += arr[i];
        }
        return -1;
    }

    /// Prefix Sum and Suffix Sum Array – O(n) Time and O(n) Space
    static int equilibriumPoint(int[] arr) {
        int prefSum = 0, total = 0;

        // Calculate the array sum
        for (int ele : arr) {
            total += ele;
        }

        // Iterate pivot over all the elements of the array
        for (int pivot = 0; pivot < arr.length; pivot++) {
            int suffSum = total - prefSum - arr[pivot];
            if (prefSum == suffSum) {
                return pivot;
            }
            prefSum += arr[pivot];
        }

        // There is no equilibrium point
        return -1;
    }


    public static void main(String[] args)
    {
    
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length;
 
        // Function call
        System.out.println("First Point of equilibrium "
        + "is at index "
        + equilibrium(arr, arr_size));
        System.out.println("First Point of equilibrium "
        + "is at index "
        + equilibriumPoint(arr));
    }
}

