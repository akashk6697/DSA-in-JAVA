
///// Insert,delete and search operations in Sorted Array
/// if array is sorted we use Binary Search



public class SortedArray {
 
///// search an element
    static int BinarySearch(int arr[],int low,int high,int key){
        if(high<low){
            return -1;
        }
        /// calcualte mid
        int mid = (low + high) / 2;
        if(key == arr[mid])
            return mid;
        
        if(key > arr[mid])
            return BinarySearch(arr, (mid + 1), high, key);

         return BinarySearch(arr, low, (mid - 1), key);
        }
          
        static int deleteElement(int arr[], int n, int key) 
        { 
            // Find position of element to be deleted 
            int pos = BinarySearch(arr, 0, n - 1, key); 
      
            if (pos == -1) { 
                System.out.println("Element not found"); 
                return n; 
            } 
      
            // Deleting element 
            int i; 
            for (i = pos; i < n - 1; i++) 
                arr[i] = arr[i + 1]; 
      
            return n - 1; 
        } 
      public static void main(String[] args){

        int arr[] = { 5, 6, 7, 8, 9, 10 }; 
        int n, key; 
        n = arr.length - 1; 
        key = 10; 
  
        // Function call 
        System.out.println("Index: "
                           + BinarySearch(arr, 0, n, key)); 

        System.out.print("Array before deletion:\n"); 
             int i;
             for (i = 0; i < n; i++) 
              System.out.print(arr[i] + " "); 
                     
            // Function call 
              n = deleteElement(arr, n, key); 
                     
         System.out.print("\n\nArray after deletion:\n"); 
          for (i = 0; i < n; i++) 
              System.out.print(arr[i] + " "); 
    }
}
