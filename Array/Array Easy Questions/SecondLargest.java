public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            // Edge case: If there are fewer than 2 elements
            return -1; // Or throw an exception if needed
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = arr[i];        // Update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // If second largest is not updated, return -1 or handle as needed
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 4, 14, 6};

        // Print the array elements
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the method and print the second largest number
        int secondLargest = getSecondLargest(arr);
        if (secondLargest != -1) {
            System.out.println("Second Largest number: " + secondLargest);
        } else {
            System.out.println("No second largest number found (array may have duplicate or insufficient elements).");
        }
    }
}
