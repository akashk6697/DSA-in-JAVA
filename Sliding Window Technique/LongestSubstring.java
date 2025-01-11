
// Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "geeksforgeeks" is "forgeks", which has length 7.
// Java code to find the largest substring with non-repeating 
// characters using Sliding Window

public class LongestSubstring {
    static final int MAX_CHAR = 256; // For all ASCII characters

    static int longestUniqueSubstr(String s) {
        if (s.length() == 0 || s.length() == 1)
            return s.length();

        int res = 0;
        boolean[] vis = new boolean[MAX_CHAR];

        // Left and right pointers for the sliding window
        int left = 0, right = 0;
        while (right < s.length()) {
            // If character is repeated, move left pointer marking
            // visited characters as false until the repeating
            // character is no longer part of the current window
            while (vis[s.charAt(right)]) {
                vis[s.charAt(left)] = false;
                left++;
            }

            // Mark the current character as visited
            vis[s.charAt(right)] = true;

            // Update the result with the maximum length of the window
            res = Math.max(res, (right - left + 1));
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(s)); // Output: 7 ("eksforg")
    }
}

