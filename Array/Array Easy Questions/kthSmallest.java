


import java.util.PriorityQueue;

public class kthSmallest {
public static int kthSmallestNumber(int arr[] ,int k){
    int N = arr.length;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
     for(int i=0;i<N;i++){
        pq.offer(arr[i]);
        if(pq.size() > k)
        pq.poll();
     }
     return pq.peek();
    }
    public static void main(String[] args) {
        int arr[] = {2,5,9,4,14,6};
        int k = 3;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
              kthSmallestNumber(arr,k);
            
        }
        System.out.println("Kth Smallest number : " + arr[k-1]);
    }
}
