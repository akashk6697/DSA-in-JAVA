// Find all triplets with zero sum
// Java program to find all triplets with zero sum using hashing

import java.util.*;

public class FindTriplet {
    static ArrayList<ArrayList<Integer>> findTriplets(int[] arr) {
        
        // Set to handle duplicates
        Set<ArrayList<Integer>> resSet = new HashSet<>();
        int n = arr.length;
        Map<Integer, List<int[]>> mp = new HashMap<>();

        // Store sum of all the pairs with their indices
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                mp.computeIfAbsent(arr[i] + arr[j], 
                              k -> new ArrayList<>()).add(new int[]{i, j});
            }
        }

        for (int i = 0; i < n; i++) {
            
            // Find remaining value to get zero sum
            int rem = -arr[i];
            if (mp.containsKey(rem)) {
                List<int[]> pairs = mp.get(rem);
                for (int[] p : pairs) {
                    
                    // Ensure no two indices are same in triplet
                    if (p[0] != i && p[1] != i) {
                        ArrayList<Integer> curr = 
                          new ArrayList<>(Arrays.asList(i, p[0], p[1]));
                        Collections.sort(curr);
                        resSet.add(curr);
                    }
                }
            }
        }
        return new ArrayList<>(resSet);  
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        ArrayList<ArrayList<Integer>> res = findTriplets(arr);
        for (ArrayList<Integer> triplet : res) {
            System.out.println(triplet.get(0) + " " + 
                               triplet.get(1) + " " + triplet.get(2));
        }
    }
}