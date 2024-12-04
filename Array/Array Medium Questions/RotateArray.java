// [Naive Approach] Rotate one by one - O(n * d) Time and O(1) Space
// [Better Approach] Using Temporary Array - O(n) Time and O(n) Space
// [Expected Approach 1] Using Juggling Algorithm - O(n) Time and O(1) Space
// [Expected Approach 2] Using Reversal Algorithm - O(n) Time and O(1) Space

public class RotateArray {
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;

        // Handle the case where d > size of array
        d %= n;

        // Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining n-d elements
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }
     // Function to reverse a portion of the array
      static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }      

public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int d = 2;

    System.out.println("Original array:");
    printArray(arr);

    rotateArr(arr, d);

    System.out.println("\nArray after rotating left by " + d + " positions:");
    printArray(arr);
}

// Utility function to print an array
static void printArray(int[] arr) {
    for (int value : arr) {
        System.out.print(value + " ");
    }
    System.out.println();
}
}