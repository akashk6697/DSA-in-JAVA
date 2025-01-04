import java.util.Scanner;

public class ArraySort012{

public static void sort012(int[] arr) {
    // code here
     int n = arr.length;
    int lo = 0;
    int hi = n - 1;
    int mid = 0;

    // Iterate till all the elements are sorted
    while (mid <= hi) {
        if (arr[mid] == 0) {
            swap(arr, mid, lo);
            lo++;
            mid++;
        }
        else if (arr[mid] == 1) {
            mid++;
        }
        else {
            swap(arr, mid, hi);
            hi--;
        }
    }
}
public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

} 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int [] arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
         }
          sort012(arr);
        sc.close();
    }
}
