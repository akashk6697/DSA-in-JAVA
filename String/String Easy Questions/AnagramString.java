
// Check if two Strings are Anagrams of each other

// Input: s1 = “geeks”  s2 = “kseeg”
// Output: true

// [Naive Approach] Using Sorting

import java.util.Arrays;

public class AnagramString {

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        
        // Sort both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println(areAnagrams(s1, s2));
    }
}

// [Expected Approach 1] Using Hash Map or Dictionary
// [Expected Approach 2] Using Frequency Array